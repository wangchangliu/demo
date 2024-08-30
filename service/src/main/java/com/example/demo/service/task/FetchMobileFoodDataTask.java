package com.example.demo.service.task;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;

import com.example.demo.dao.generate.dto.MerchantDTO;
import com.example.demo.dao.generate.dto.MerchantDTOExample;
import com.example.demo.dao.generate.mapper.MerchantDTOMapper;
import com.example.demo.service.common.RedisConstant;
import com.example.demo.service.task.entity.MobileFoodData;
import com.example.demo.service.utils.DateUtils;
import com.example.demo.service.utils.TransactionUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.GeoOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
@Slf4j
public class FetchMobileFoodDataTask {
    @Resource
    private MerchantDTOMapper merchantDTOMapper;
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    @Resource
    private TransactionUtil transactionUtil;

    private static final int limit = 200;
    private static final String BASE_URL = "http://data.sfgov.org/api/id/rqzj-sfat.json";

    /**
     * 每小时执行一次  防止网络原因导致数据拉取失败 因此通过每小时执行的方式来处理
     */
    @Scheduled(cron = "0 0 0/1 * * ? ")
    @PostConstruct
    public void exec() {
        log.info("start to fetch mobile food data");
        // 幂等
        MerchantDTOExample example = new MerchantDTOExample();
        example.createCriteria().andCreateAtGreaterThanOrEqualTo(DateUtils.getZeroTime(new Date()));
        long count = merchantDTOMapper.countByExample(example);
        if (count > 0) {
            log.info("This task has already been executed");
        } else {
            List<MerchantDTO> merchantDTOList = fetchDataWithOffsetAndLimit();
            if (CollectionUtils.isNotEmpty(merchantDTOList)) {
                transactionUtil.executeWithoutResult(() -> {
                    // 先删除历史数据
                    MerchantDTOExample deleteExample = new MerchantDTOExample();
                    deleteExample.createCriteria().andCreateAtLessThan(DateUtils.getZeroTime(new Date()));
                    merchantDTOMapper.deleteByExample(deleteExample);
                    Map<String, Point> geoLocationsMap = new HashMap<>();
                    merchantDTOList.forEach(merchantDTO -> geoLocationsMap.putIfAbsent(merchantDTO.getLocationId().toString(),
                        new Point(merchantDTO.getLongitude().doubleValue(), merchantDTO.getLatitude().doubleValue())));
                    // 添加到redis中
                    addGeoLocations(geoLocationsMap);
                    // 新增当天数据
                    merchantDTOMapper.batchInsert(merchantDTOList);
                });
            }
        }

    }

    /**
     * Fetches data from the provided API with a specified offset and limit.
     */
    private List<MerchantDTO> fetchDataWithOffsetAndLimit() {
        OkHttpClient client = new OkHttpClient();

        int offset = 0;

        List<MerchantDTO> addMerchantDTOList = new ArrayList<>();
        while (true) {
            String requestUrl = BASE_URL + "?$query=select *, :id offset " + offset
                + " limit " + limit;
            Request request = new Request.Builder()
                .url(requestUrl)
                .build();
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    List<MobileFoodData> mobileFoodDataList = JSON.parseArray(response.body().string(), MobileFoodData.class);
                    List<MerchantDTO> merchantDTOList = mobileFoodDataList.stream().map(this::buildMerchantDTO).collect(
                        Collectors.toList());
                    addMerchantDTOList.addAll(merchantDTOList);
                    if (mobileFoodDataList.size() < limit) {
                        break;
                    }
                    offset += limit;
                }
            } catch (Exception e) {
                log.error("fetch data failed", e);
                throw new RuntimeException("fetch data failed");
            }
        }
        return addMerchantDTOList;
    }

    private MerchantDTO buildMerchantDTO(MobileFoodData mobileFoodData) {
        MerchantDTO merchantDTO = new MerchantDTO();
        merchantDTO.setLocationId(Integer.parseInt(mobileFoodData.getObjectid()));
        merchantDTO.setLocation(mobileFoodData.getLocation());
        merchantDTO.setLocationDescription(mobileFoodData.getLocationdescription());
        merchantDTO.setApplicant(mobileFoodData.getApplicant());
        merchantDTO.setAddress(mobileFoodData.getAddress());
        merchantDTO.setApproved(mobileFoodData.getApproved());
        merchantDTO.setBlock(mobileFoodData.getBlock());
        merchantDTO.setBlockLot(mobileFoodData.getBlocklot());
        merchantDTO.setCnn(mobileFoodData.getCnn());
        merchantDTO.setDaysHours(mobileFoodData.getDayshours());
        merchantDTO.setExpirationDate(mobileFoodData.getExpirationdate());
        merchantDTO.setStatus(mobileFoodData.getStatus());
        merchantDTO.setFacilityType(mobileFoodData.getFacilitytype());
        merchantDTO.setFoodItems(mobileFoodData.getFooditems());
        merchantDTO.setApproved(mobileFoodData.getApproved());
        merchantDTO.setX(BigDecimal.valueOf(mobileFoodData.getX()));
        merchantDTO.setY(BigDecimal.valueOf(mobileFoodData.getY()));
        merchantDTO.setLatitude(BigDecimal.valueOf(mobileFoodData.getLatitude()));
        merchantDTO.setLongitude(BigDecimal.valueOf(mobileFoodData.getLongitude()));
        merchantDTO.setCreateAt(new Date());
        merchantDTO.setPermit(mobileFoodData.getPermit());
        merchantDTO.setPriorPermit(mobileFoodData.getPriorpermit());

        return merchantDTO;
    }

    public void addGeoLocations(Map<String, Point> geoLocationsMap) {
        if (geoLocationsMap.isEmpty()) {
            return;
        }
        // 使用RedisTemplate的opsForGeo方法获取GeoOperations对象
        GeoOperations<String, String> geoOps = redisTemplate.opsForGeo();
        // 执行批量添加操作
        String key = RedisConstant.GEO_KEY + DateUtils.format(new Date());
        long addedCount = geoOps.add(key, geoLocationsMap);
        // 为键设置过期时间，一天后过期 这样可以避免脏数据
        boolean isKeyExpired = redisTemplate.expire(key, 1, TimeUnit.DAYS);
        log.info("Added " + addedCount + " geo locations to " + RedisConstant.GEO_KEY);
    }

}
