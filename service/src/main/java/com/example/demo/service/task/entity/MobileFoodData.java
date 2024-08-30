package com.example.demo.service.task.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MobileFoodData {
    private String objectid;
    private String applicant;
    private String facilitytype;
    private String cnn;
    private String locationdescription;
    private String address;
    private String blocklot;
    private String block;
    private String lot;
    private String permit;
    private String status;
    private String fooditems;
    private double x;
    private double y;
    private double latitude;
    private double longitude;
    private String schedule;
    private String dayshours;
    private Date approved;
    private String received;
    private String priorpermit;
    private Date expirationdate;
    private String location;
    private String id;

    // Location inner class
    @Data
    public static class Location {
        private double latitude;
        private double longitude;
        private HumanAddress human_address;

        // HumanAddress inner class
        @Data
        public static class HumanAddress {
            private String address;
            private String city;
            private String state;
            private String zip;

        }
    }
}