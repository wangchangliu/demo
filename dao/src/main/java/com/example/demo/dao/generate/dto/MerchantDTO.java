package com.example.demo.dao.generate.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MerchantDTO implements Serializable {
    private Integer id;

    private Integer locationId;

    private String applicant;

    private String facilityType;

    private String cnn;

    private String locationDescription;

    private String address;

    private String blockLot;

    private String block;

    private String lot;

    private String permit;

    private String status;

    private String foodItems;

    private BigDecimal x;

    private BigDecimal y;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String schedule;

    private String daysHours;

    private String noiseSent;

    private Date approved;

    private Date received;

    private String priorPermit;

    private Date expirationDate;

    private String location;

    private Integer firePreventionDistricts;

    private Integer policeDistricts;

    private Integer supervisorDistricts;

    private String zipCodes;

    private String neighborhoodsOld;

    private BigDecimal saleAmount;

    private Date createAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType == null ? null : facilityType.trim();
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn == null ? null : cnn.trim();
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription == null ? null : locationDescription.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBlockLot() {
        return blockLot;
    }

    public void setBlockLot(String blockLot) {
        this.blockLot = blockLot == null ? null : blockLot.trim();
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block == null ? null : block.trim();
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot == null ? null : lot.trim();
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit == null ? null : permit.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems == null ? null : foodItems.trim();
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    public String getDaysHours() {
        return daysHours;
    }

    public void setDaysHours(String daysHours) {
        this.daysHours = daysHours == null ? null : daysHours.trim();
    }

    public String getNoiseSent() {
        return noiseSent;
    }

    public void setNoiseSent(String noiseSent) {
        this.noiseSent = noiseSent == null ? null : noiseSent.trim();
    }

    public Date getApproved() {
        return approved;
    }

    public void setApproved(Date approved) {
        this.approved = approved;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public String getPriorPermit() {
        return priorPermit;
    }

    public void setPriorPermit(String priorPermit) {
        this.priorPermit = priorPermit == null ? null : priorPermit.trim();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getFirePreventionDistricts() {
        return firePreventionDistricts;
    }

    public void setFirePreventionDistricts(Integer firePreventionDistricts) {
        this.firePreventionDistricts = firePreventionDistricts;
    }

    public Integer getPoliceDistricts() {
        return policeDistricts;
    }

    public void setPoliceDistricts(Integer policeDistricts) {
        this.policeDistricts = policeDistricts;
    }

    public Integer getSupervisorDistricts() {
        return supervisorDistricts;
    }

    public void setSupervisorDistricts(Integer supervisorDistricts) {
        this.supervisorDistricts = supervisorDistricts;
    }

    public String getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(String zipCodes) {
        this.zipCodes = zipCodes == null ? null : zipCodes.trim();
    }

    public String getNeighborhoodsOld() {
        return neighborhoodsOld;
    }

    public void setNeighborhoodsOld(String neighborhoodsOld) {
        this.neighborhoodsOld = neighborhoodsOld == null ? null : neighborhoodsOld.trim();
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}