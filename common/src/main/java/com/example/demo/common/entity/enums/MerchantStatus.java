package com.example.demo.common.entity.enums;

public enum MerchantStatus {
    APPROVED("APPROVED"),
    EXPIRED("EXPIRED"),
    ISSUED("ISSUED"),
    REQUESTED("REQUESTED"),
    SUSPEND("SUSPEND");

    private String value;

    MerchantStatus(String value) {
        this.value = value;
    }

}
