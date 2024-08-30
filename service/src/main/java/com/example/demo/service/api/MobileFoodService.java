package com.example.demo.service.api;

import java.util.List;

import com.example.demo.common.entity.req.LocationReq;
import com.example.demo.common.entity.resp.MobileFoodMerchantResp;

public interface MobileFoodService {
    /**
     * query mobile food merchant by id
     */
    MobileFoodMerchantResp queryByLocationId(int locationId);

    /**
     * query mobile food merchant by location
     */
    List<MobileFoodMerchantResp> queryByLocation(LocationReq locationReq);

    /**
     * query mobile food merchant by food KeyWords
     */
    List<MobileFoodMerchantResp> queryByFoodKeyWords(String foodKeyWords);

    /**
     * query the merchant with the best sales
     */
    List<MobileFoodMerchantResp> querySaleRankList();


    /**
     * query the merchant that coming soon
     */
    List<MobileFoodMerchantResp> queryComingSoon();
}
