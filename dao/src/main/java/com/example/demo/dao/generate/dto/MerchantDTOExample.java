package com.example.demo.dao.generate.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantDTOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantDTOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIsNull() {
            addCriterion("facility_type is null");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIsNotNull() {
            addCriterion("facility_type is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeEqualTo(String value) {
            addCriterion("facility_type =", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeNotEqualTo(String value) {
            addCriterion("facility_type <>", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeGreaterThan(String value) {
            addCriterion("facility_type >", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("facility_type >=", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeLessThan(String value) {
            addCriterion("facility_type <", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeLessThanOrEqualTo(String value) {
            addCriterion("facility_type <=", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeLike(String value) {
            addCriterion("facility_type like", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeNotLike(String value) {
            addCriterion("facility_type not like", value, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeIn(List<String> values) {
            addCriterion("facility_type in", values, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeNotIn(List<String> values) {
            addCriterion("facility_type not in", values, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeBetween(String value1, String value2) {
            addCriterion("facility_type between", value1, value2, "facilityType");
            return (Criteria) this;
        }

        public Criteria andFacilityTypeNotBetween(String value1, String value2) {
            addCriterion("facility_type not between", value1, value2, "facilityType");
            return (Criteria) this;
        }

        public Criteria andCnnIsNull() {
            addCriterion("cnn is null");
            return (Criteria) this;
        }

        public Criteria andCnnIsNotNull() {
            addCriterion("cnn is not null");
            return (Criteria) this;
        }

        public Criteria andCnnEqualTo(String value) {
            addCriterion("cnn =", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotEqualTo(String value) {
            addCriterion("cnn <>", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnGreaterThan(String value) {
            addCriterion("cnn >", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnGreaterThanOrEqualTo(String value) {
            addCriterion("cnn >=", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLessThan(String value) {
            addCriterion("cnn <", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLessThanOrEqualTo(String value) {
            addCriterion("cnn <=", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnLike(String value) {
            addCriterion("cnn like", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotLike(String value) {
            addCriterion("cnn not like", value, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnIn(List<String> values) {
            addCriterion("cnn in", values, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotIn(List<String> values) {
            addCriterion("cnn not in", values, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnBetween(String value1, String value2) {
            addCriterion("cnn between", value1, value2, "cnn");
            return (Criteria) this;
        }

        public Criteria andCnnNotBetween(String value1, String value2) {
            addCriterion("cnn not between", value1, value2, "cnn");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionIsNull() {
            addCriterion("location_description is null");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionIsNotNull() {
            addCriterion("location_description is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionEqualTo(String value) {
            addCriterion("location_description =", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionNotEqualTo(String value) {
            addCriterion("location_description <>", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionGreaterThan(String value) {
            addCriterion("location_description >", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("location_description >=", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionLessThan(String value) {
            addCriterion("location_description <", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionLessThanOrEqualTo(String value) {
            addCriterion("location_description <=", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionLike(String value) {
            addCriterion("location_description like", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionNotLike(String value) {
            addCriterion("location_description not like", value, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionIn(List<String> values) {
            addCriterion("location_description in", values, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionNotIn(List<String> values) {
            addCriterion("location_description not in", values, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionBetween(String value1, String value2) {
            addCriterion("location_description between", value1, value2, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andLocationDescriptionNotBetween(String value1, String value2) {
            addCriterion("location_description not between", value1, value2, "locationDescription");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBlockLotIsNull() {
            addCriterion("block_lot is null");
            return (Criteria) this;
        }

        public Criteria andBlockLotIsNotNull() {
            addCriterion("block_lot is not null");
            return (Criteria) this;
        }

        public Criteria andBlockLotEqualTo(String value) {
            addCriterion("block_lot =", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotNotEqualTo(String value) {
            addCriterion("block_lot <>", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotGreaterThan(String value) {
            addCriterion("block_lot >", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotGreaterThanOrEqualTo(String value) {
            addCriterion("block_lot >=", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotLessThan(String value) {
            addCriterion("block_lot <", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotLessThanOrEqualTo(String value) {
            addCriterion("block_lot <=", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotLike(String value) {
            addCriterion("block_lot like", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotNotLike(String value) {
            addCriterion("block_lot not like", value, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotIn(List<String> values) {
            addCriterion("block_lot in", values, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotNotIn(List<String> values) {
            addCriterion("block_lot not in", values, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotBetween(String value1, String value2) {
            addCriterion("block_lot between", value1, value2, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockLotNotBetween(String value1, String value2) {
            addCriterion("block_lot not between", value1, value2, "blockLot");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("block like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("block not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andLotIsNull() {
            addCriterion("lot is null");
            return (Criteria) this;
        }

        public Criteria andLotIsNotNull() {
            addCriterion("lot is not null");
            return (Criteria) this;
        }

        public Criteria andLotEqualTo(String value) {
            addCriterion("lot =", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotEqualTo(String value) {
            addCriterion("lot <>", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThan(String value) {
            addCriterion("lot >", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThanOrEqualTo(String value) {
            addCriterion("lot >=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThan(String value) {
            addCriterion("lot <", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThanOrEqualTo(String value) {
            addCriterion("lot <=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLike(String value) {
            addCriterion("lot like", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotLike(String value) {
            addCriterion("lot not like", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotIn(List<String> values) {
            addCriterion("lot in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotIn(List<String> values) {
            addCriterion("lot not in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotBetween(String value1, String value2) {
            addCriterion("lot between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotBetween(String value1, String value2) {
            addCriterion("lot not between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andPermitIsNull() {
            addCriterion("permit is null");
            return (Criteria) this;
        }

        public Criteria andPermitIsNotNull() {
            addCriterion("permit is not null");
            return (Criteria) this;
        }

        public Criteria andPermitEqualTo(String value) {
            addCriterion("permit =", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotEqualTo(String value) {
            addCriterion("permit <>", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitGreaterThan(String value) {
            addCriterion("permit >", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitGreaterThanOrEqualTo(String value) {
            addCriterion("permit >=", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLessThan(String value) {
            addCriterion("permit <", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLessThanOrEqualTo(String value) {
            addCriterion("permit <=", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitLike(String value) {
            addCriterion("permit like", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotLike(String value) {
            addCriterion("permit not like", value, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitIn(List<String> values) {
            addCriterion("permit in", values, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotIn(List<String> values) {
            addCriterion("permit not in", values, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitBetween(String value1, String value2) {
            addCriterion("permit between", value1, value2, "permit");
            return (Criteria) this;
        }

        public Criteria andPermitNotBetween(String value1, String value2) {
            addCriterion("permit not between", value1, value2, "permit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFoodItemsIsNull() {
            addCriterion("food_items is null");
            return (Criteria) this;
        }

        public Criteria andFoodItemsIsNotNull() {
            addCriterion("food_items is not null");
            return (Criteria) this;
        }

        public Criteria andFoodItemsEqualTo(String value) {
            addCriterion("food_items =", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsNotEqualTo(String value) {
            addCriterion("food_items <>", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsGreaterThan(String value) {
            addCriterion("food_items >", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsGreaterThanOrEqualTo(String value) {
            addCriterion("food_items >=", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsLessThan(String value) {
            addCriterion("food_items <", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsLessThanOrEqualTo(String value) {
            addCriterion("food_items <=", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsLike(String value) {
            addCriterion("food_items like", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsNotLike(String value) {
            addCriterion("food_items not like", value, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsIn(List<String> values) {
            addCriterion("food_items in", values, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsNotIn(List<String> values) {
            addCriterion("food_items not in", values, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsBetween(String value1, String value2) {
            addCriterion("food_items between", value1, value2, "foodItems");
            return (Criteria) this;
        }

        public Criteria andFoodItemsNotBetween(String value1, String value2) {
            addCriterion("food_items not between", value1, value2, "foodItems");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(BigDecimal value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(BigDecimal value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(BigDecimal value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(BigDecimal value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<BigDecimal> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<BigDecimal> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(BigDecimal value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(BigDecimal value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(BigDecimal value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(BigDecimal value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<BigDecimal> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<BigDecimal> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(String value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(String value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(String value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(String value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(String value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLike(String value) {
            addCriterion("schedule like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotLike(String value) {
            addCriterion("schedule not like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<String> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<String> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(String value1, String value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(String value1, String value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIsNull() {
            addCriterion("days_hours is null");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIsNotNull() {
            addCriterion("days_hours is not null");
            return (Criteria) this;
        }

        public Criteria andDaysHoursEqualTo(String value) {
            addCriterion("days_hours =", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotEqualTo(String value) {
            addCriterion("days_hours <>", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursGreaterThan(String value) {
            addCriterion("days_hours >", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursGreaterThanOrEqualTo(String value) {
            addCriterion("days_hours >=", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursLessThan(String value) {
            addCriterion("days_hours <", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursLessThanOrEqualTo(String value) {
            addCriterion("days_hours <=", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursLike(String value) {
            addCriterion("days_hours like", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotLike(String value) {
            addCriterion("days_hours not like", value, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursIn(List<String> values) {
            addCriterion("days_hours in", values, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotIn(List<String> values) {
            addCriterion("days_hours not in", values, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursBetween(String value1, String value2) {
            addCriterion("days_hours between", value1, value2, "daysHours");
            return (Criteria) this;
        }

        public Criteria andDaysHoursNotBetween(String value1, String value2) {
            addCriterion("days_hours not between", value1, value2, "daysHours");
            return (Criteria) this;
        }

        public Criteria andNoiseSentIsNull() {
            addCriterion("noise_sent is null");
            return (Criteria) this;
        }

        public Criteria andNoiseSentIsNotNull() {
            addCriterion("noise_sent is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseSentEqualTo(String value) {
            addCriterion("noise_sent =", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentNotEqualTo(String value) {
            addCriterion("noise_sent <>", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentGreaterThan(String value) {
            addCriterion("noise_sent >", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentGreaterThanOrEqualTo(String value) {
            addCriterion("noise_sent >=", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentLessThan(String value) {
            addCriterion("noise_sent <", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentLessThanOrEqualTo(String value) {
            addCriterion("noise_sent <=", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentLike(String value) {
            addCriterion("noise_sent like", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentNotLike(String value) {
            addCriterion("noise_sent not like", value, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentIn(List<String> values) {
            addCriterion("noise_sent in", values, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentNotIn(List<String> values) {
            addCriterion("noise_sent not in", values, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentBetween(String value1, String value2) {
            addCriterion("noise_sent between", value1, value2, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andNoiseSentNotBetween(String value1, String value2) {
            addCriterion("noise_sent not between", value1, value2, "noiseSent");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNull() {
            addCriterion("approved is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNotNull() {
            addCriterion("approved is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedEqualTo(Date value) {
            addCriterion("approved =", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotEqualTo(Date value) {
            addCriterion("approved <>", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThan(Date value) {
            addCriterion("approved >", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThanOrEqualTo(Date value) {
            addCriterion("approved >=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThan(Date value) {
            addCriterion("approved <", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThanOrEqualTo(Date value) {
            addCriterion("approved <=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedIn(List<Date> values) {
            addCriterion("approved in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotIn(List<Date> values) {
            addCriterion("approved not in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedBetween(Date value1, Date value2) {
            addCriterion("approved between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotBetween(Date value1, Date value2) {
            addCriterion("approved not between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNull() {
            addCriterion("received is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNotNull() {
            addCriterion("received is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedEqualTo(Date value) {
            addCriterion("received =", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotEqualTo(Date value) {
            addCriterion("received <>", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThan(Date value) {
            addCriterion("received >", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThanOrEqualTo(Date value) {
            addCriterion("received >=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThan(Date value) {
            addCriterion("received <", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThanOrEqualTo(Date value) {
            addCriterion("received <=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedIn(List<Date> values) {
            addCriterion("received in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotIn(List<Date> values) {
            addCriterion("received not in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedBetween(Date value1, Date value2) {
            addCriterion("received between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotBetween(Date value1, Date value2) {
            addCriterion("received not between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andPriorPermitIsNull() {
            addCriterion("prior_permit is null");
            return (Criteria) this;
        }

        public Criteria andPriorPermitIsNotNull() {
            addCriterion("prior_permit is not null");
            return (Criteria) this;
        }

        public Criteria andPriorPermitEqualTo(String value) {
            addCriterion("prior_permit =", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitNotEqualTo(String value) {
            addCriterion("prior_permit <>", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitGreaterThan(String value) {
            addCriterion("prior_permit >", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitGreaterThanOrEqualTo(String value) {
            addCriterion("prior_permit >=", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitLessThan(String value) {
            addCriterion("prior_permit <", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitLessThanOrEqualTo(String value) {
            addCriterion("prior_permit <=", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitLike(String value) {
            addCriterion("prior_permit like", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitNotLike(String value) {
            addCriterion("prior_permit not like", value, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitIn(List<String> values) {
            addCriterion("prior_permit in", values, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitNotIn(List<String> values) {
            addCriterion("prior_permit not in", values, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitBetween(String value1, String value2) {
            addCriterion("prior_permit between", value1, value2, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andPriorPermitNotBetween(String value1, String value2) {
            addCriterion("prior_permit not between", value1, value2, "priorPermit");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterion("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterion("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterion("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterion("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterion("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterion("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterion("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterion("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterion("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIsNull() {
            addCriterion("fire_prevention_districts is null");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIsNotNull() {
            addCriterion("fire_prevention_districts is not null");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsEqualTo(Integer value) {
            addCriterion("fire_prevention_districts =", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotEqualTo(Integer value) {
            addCriterion("fire_prevention_districts <>", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsGreaterThan(Integer value) {
            addCriterion("fire_prevention_districts >", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire_prevention_districts >=", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsLessThan(Integer value) {
            addCriterion("fire_prevention_districts <", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsLessThanOrEqualTo(Integer value) {
            addCriterion("fire_prevention_districts <=", value, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsIn(List<Integer> values) {
            addCriterion("fire_prevention_districts in", values, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotIn(List<Integer> values) {
            addCriterion("fire_prevention_districts not in", values, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsBetween(Integer value1, Integer value2) {
            addCriterion("fire_prevention_districts between", value1, value2, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andFirePreventionDistrictsNotBetween(Integer value1, Integer value2) {
            addCriterion("fire_prevention_districts not between", value1, value2, "firePreventionDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIsNull() {
            addCriterion("police_districts is null");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIsNotNull() {
            addCriterion("police_districts is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsEqualTo(Integer value) {
            addCriterion("police_districts =", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotEqualTo(Integer value) {
            addCriterion("police_districts <>", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsGreaterThan(Integer value) {
            addCriterion("police_districts >", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsGreaterThanOrEqualTo(Integer value) {
            addCriterion("police_districts >=", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsLessThan(Integer value) {
            addCriterion("police_districts <", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsLessThanOrEqualTo(Integer value) {
            addCriterion("police_districts <=", value, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsIn(List<Integer> values) {
            addCriterion("police_districts in", values, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotIn(List<Integer> values) {
            addCriterion("police_districts not in", values, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsBetween(Integer value1, Integer value2) {
            addCriterion("police_districts between", value1, value2, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andPoliceDistrictsNotBetween(Integer value1, Integer value2) {
            addCriterion("police_districts not between", value1, value2, "policeDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIsNull() {
            addCriterion("supervisor_districts is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIsNotNull() {
            addCriterion("supervisor_districts is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsEqualTo(Integer value) {
            addCriterion("supervisor_districts =", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotEqualTo(Integer value) {
            addCriterion("supervisor_districts <>", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsGreaterThan(Integer value) {
            addCriterion("supervisor_districts >", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsGreaterThanOrEqualTo(Integer value) {
            addCriterion("supervisor_districts >=", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsLessThan(Integer value) {
            addCriterion("supervisor_districts <", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsLessThanOrEqualTo(Integer value) {
            addCriterion("supervisor_districts <=", value, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsIn(List<Integer> values) {
            addCriterion("supervisor_districts in", values, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotIn(List<Integer> values) {
            addCriterion("supervisor_districts not in", values, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_districts between", value1, value2, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andSupervisorDistrictsNotBetween(Integer value1, Integer value2) {
            addCriterion("supervisor_districts not between", value1, value2, "supervisorDistricts");
            return (Criteria) this;
        }

        public Criteria andZipCodesIsNull() {
            addCriterion("zip_codes is null");
            return (Criteria) this;
        }

        public Criteria andZipCodesIsNotNull() {
            addCriterion("zip_codes is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodesEqualTo(String value) {
            addCriterion("zip_codes =", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotEqualTo(String value) {
            addCriterion("zip_codes <>", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesGreaterThan(String value) {
            addCriterion("zip_codes >", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesGreaterThanOrEqualTo(String value) {
            addCriterion("zip_codes >=", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLessThan(String value) {
            addCriterion("zip_codes <", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLessThanOrEqualTo(String value) {
            addCriterion("zip_codes <=", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesLike(String value) {
            addCriterion("zip_codes like", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotLike(String value) {
            addCriterion("zip_codes not like", value, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesIn(List<String> values) {
            addCriterion("zip_codes in", values, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotIn(List<String> values) {
            addCriterion("zip_codes not in", values, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesBetween(String value1, String value2) {
            addCriterion("zip_codes between", value1, value2, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andZipCodesNotBetween(String value1, String value2) {
            addCriterion("zip_codes not between", value1, value2, "zipCodes");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldIsNull() {
            addCriterion("neighborhoods_old is null");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldIsNotNull() {
            addCriterion("neighborhoods_old is not null");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldEqualTo(String value) {
            addCriterion("neighborhoods_old =", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldNotEqualTo(String value) {
            addCriterion("neighborhoods_old <>", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldGreaterThan(String value) {
            addCriterion("neighborhoods_old >", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldGreaterThanOrEqualTo(String value) {
            addCriterion("neighborhoods_old >=", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldLessThan(String value) {
            addCriterion("neighborhoods_old <", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldLessThanOrEqualTo(String value) {
            addCriterion("neighborhoods_old <=", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldLike(String value) {
            addCriterion("neighborhoods_old like", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldNotLike(String value) {
            addCriterion("neighborhoods_old not like", value, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldIn(List<String> values) {
            addCriterion("neighborhoods_old in", values, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldNotIn(List<String> values) {
            addCriterion("neighborhoods_old not in", values, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldBetween(String value1, String value2) {
            addCriterion("neighborhoods_old between", value1, value2, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andNeighborhoodsOldNotBetween(String value1, String value2) {
            addCriterion("neighborhoods_old not between", value1, value2, "neighborhoodsOld");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("sale_amount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("sale_amount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("sale_amount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("sale_amount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("sale_amount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("sale_amount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}