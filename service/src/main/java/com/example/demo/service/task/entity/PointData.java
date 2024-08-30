package com.example.demo.service.task.entity;

import lombok.Data;
import org.springframework.data.geo.Point;

@Data
public class PointData {
    private Point point;
    private String member;
}
