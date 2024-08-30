package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.example.demo.common.entity.enums.MerchantStatus;
import com.example.demo.common.entity.req.LocationReq;
import com.example.demo.common.entity.resp.MobileFoodMerchantResp;
import com.example.demo.dao.generate.dto.MerchantDTO;
import com.example.demo.dao.generate.dto.MerchantDTOExample;
import com.example.demo.dao.generate.mapper.MerchantDTOMapper;
import com.example.demo.service.api.MobileFoodService;
import com.example.demo.service.common.RedisConstant;
import com.example.demo.service.utils.DateUtils;
import org.apache.commons.collections.CollectionUtils;
import org.assertj.core.util.Lists;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.GeoResult;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.connection.RedisGeoCommands;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.domain.geo.GeoLocation;
import org.springframework.stereotype.Service;

@Service
public class MobileFoodServiceImpl implements MobileFoodService {
    @Resource
    private MerchantDTOMapper merchantDTOMapper;
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public MobileFoodMerchantResp queryByLocationId(int locationId) {
        MerchantDTOExample example = new MerchantDTOExample();
        example.createCriteria().andLocationIdEqualTo(locationId);
        List<MerchantDTO> merchantDTOList = merchantDTOMapper.selectByExample(example);
        if (merchantDTOList.size() == 0) {
            throw new RuntimeException("invalid parameter");
        }
        return buildMobileFoodMerchantResp(merchantDTOList.get(0));
    }

    @Override
    public List<MobileFoodMerchantResp> queryByLocation(LocationReq locationReq) {
        List<MobileFoodMerchantResp> respList = new ArrayList<>();
        Circle circle = new Circle(new Point(locationReq.getLongitude(), locationReq.getLatitude()), locationReq.getMeters());

        // 执行搜索
        GeoResults<RedisGeoCommands.GeoLocation<String>> results = redisTemplate.opsForGeo()
            .search(RedisConstant.GEO_KEY + DateUtils.format(new Date()), circle);
        // 遍历结果集
        List<Integer> locationIdList = new ArrayList<>();
        for (GeoResult<RedisGeoCommands.GeoLocation<String>> result : results.getContent()) {
            GeoLocation<String> location = result.getContent();
            // 获取locationId
            locationIdList.add(Integer.valueOf(location.getName()));
        }
        if (CollectionUtils.isNotEmpty(locationIdList)) {
            MerchantDTOExample example = new MerchantDTOExample();
            example.createCriteria().andLocationIdIn(locationIdList).andStatusEqualTo(MerchantStatus.REQUESTED.name());
            List<MerchantDTO> merchantDTOList = merchantDTOMapper.selectByExample(example);
            respList = merchantDTOList.stream().filter(this::isOpening).map(this::buildMobileFoodMerchantResp).collect(Collectors.toList());
        }
        return respList;
    }

    @Override
    public List<MobileFoodMerchantResp> queryByFoodKeyWords(String foodKeyWords) {
        MerchantDTOExample example = new MerchantDTOExample();
        example.createCriteria().andFoodItemsLike("%" + foodKeyWords + "%").andStatusEqualTo(MerchantStatus.REQUESTED.name());
        List<MerchantDTO> merchantDTOList = merchantDTOMapper.selectByExample(example);
        return merchantDTOList.stream().filter(this::isOpening).map(this::buildMobileFoodMerchantResp).collect(Collectors.toList());
    }

    @Override
    public List<MobileFoodMerchantResp> querySaleRankList() {
        // 假设我们能拿到商家的销量数据 就可以做个排行榜
        MerchantDTOExample example = new MerchantDTOExample();
        example.createCriteria().andStatusEqualTo(MerchantStatus.REQUESTED.name());
        example.setOrderByClause("sale_amount desc limit 10");
        List<MerchantDTO> merchantDTOList = merchantDTOMapper.selectByExample(example);
        return merchantDTOList.stream().filter(this::isOpening).map(this::buildMobileFoodMerchantResp).collect(Collectors.toList());
    }

    @Override
    public List<MobileFoodMerchantResp> queryComingSoon() {
        // 我们可以为那些可能即将开业 提出申请或者发布的商家做一个广告
        MerchantDTOExample example = new MerchantDTOExample();
        example.createCriteria().andStatusIn(Lists.newArrayList(MerchantStatus.ISSUED.name(), MerchantStatus.APPROVED.name()));
        List<MerchantDTO> merchantDTOList = merchantDTOMapper.selectByExample(example);
        return merchantDTOList.stream().map(this::buildMobileFoodMerchantResp).collect(Collectors.toList());
    }

    private MobileFoodMerchantResp buildMobileFoodMerchantResp(MerchantDTO merchantDTO) {
        MobileFoodMerchantResp resp = new MobileFoodMerchantResp();
        resp.locationId = merchantDTO.getLocationId();
        resp.applicant = merchantDTO.getApplicant();
        resp.cnn = merchantDTO.getCnn();
        resp.locationDescription = merchantDTO.getLocationDescription();
        resp.permit = merchantDTO.getStatus();
        resp.dayshours = merchantDTO.getDaysHours();
        resp.status = merchantDTO.getStatus();
        return resp;
    }

    private boolean isOpening(MerchantDTO merchantDTO) {
        // 这里需要根据 merchantDTO的daysHours 进行一些判断 判断当前时间是否营业 时间关系 这里省略实现 大概思路应该是用正则表达式来匹配
        return true;
    }
}
