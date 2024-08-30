package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;

import com.example.demo.common.entity.req.LocationReq;
import com.example.demo.common.entity.resp.MobileFoodMerchantResp;
import com.example.demo.service.api.MobileFoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
@Slf4j
public class MobileFoodController {
    @Resource
    private MobileFoodService mobileFoodService;

    @GetMapping("/queryByLocationId")
    public MobileFoodMerchantResp queryByLocationId(@RequestParam int locationId) {
        log.info("handle queryById request:{}", locationId);
        return mobileFoodService.queryByLocationId(locationId);
    }

    @PostMapping("/queryByLocation")
    public List<MobileFoodMerchantResp> queryByLocation(@RequestBody LocationReq locationReq) {
        log.info("handle queryByLocation request:{}", JSON.toJSONString(locationReq));
        return mobileFoodService.queryByLocation(locationReq);
    }

    @GetMapping("/queryByFoodKeyWords")
    public List<MobileFoodMerchantResp> queryByFoodKeyWords(@RequestParam String foodKeyWords) {
        log.info("handle queryByFoodKeyWords request:{}", foodKeyWords);
        return mobileFoodService.queryByFoodKeyWords(foodKeyWords);
    }

    @GetMapping("/querySaleRankList")
    public List<MobileFoodMerchantResp> querySaleRankList() {
        log.info("handle querySaleRankList");
        return mobileFoodService.querySaleRankList();
    }

    @GetMapping("/queryComingSoon")
    public List<MobileFoodMerchantResp> queryComingSoon() {
        log.info("handle queryComingSoon");
        return mobileFoodService.queryComingSoon();
    }
}
