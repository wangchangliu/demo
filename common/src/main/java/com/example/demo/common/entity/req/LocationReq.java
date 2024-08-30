package com.example.demo.common.entity.req;

import com.example.demo.common.entity.BaseEntity;
import lombok.Data;

@Data
public class LocationReq extends BaseEntity {
    private double latitude;
    private double longitude;
    private double meters;
}
