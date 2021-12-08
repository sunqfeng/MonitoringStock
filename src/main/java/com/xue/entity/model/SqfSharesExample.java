package com.xue.entity.model;

import java.util.ArrayList;
import java.util.List;

public class SqfSharesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqfSharesExample() {
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

        public Criteria andSecuritiesNameIsNull() {
            addCriterion("securities_name is null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameIsNotNull() {
            addCriterion("securities_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameEqualTo(String value) {
            addCriterion("securities_name =", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameNotEqualTo(String value) {
            addCriterion("securities_name <>", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameGreaterThan(String value) {
            addCriterion("securities_name >", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("securities_name >=", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameLessThan(String value) {
            addCriterion("securities_name <", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameLessThanOrEqualTo(String value) {
            addCriterion("securities_name <=", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameLike(String value) {
            addCriterion("securities_name like", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameNotLike(String value) {
            addCriterion("securities_name not like", value, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameIn(List<String> values) {
            addCriterion("securities_name in", values, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameNotIn(List<String> values) {
            addCriterion("securities_name not in", values, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameBetween(String value1, String value2) {
            addCriterion("securities_name between", value1, value2, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNameNotBetween(String value1, String value2) {
            addCriterion("securities_name not between", value1, value2, "securitiesName");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeIsNull() {
            addCriterion("securities_code is null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeIsNotNull() {
            addCriterion("securities_code is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeEqualTo(String value) {
            addCriterion("securities_code =", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeNotEqualTo(String value) {
            addCriterion("securities_code <>", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeGreaterThan(String value) {
            addCriterion("securities_code >", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("securities_code >=", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeLessThan(String value) {
            addCriterion("securities_code <", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeLessThanOrEqualTo(String value) {
            addCriterion("securities_code <=", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeLike(String value) {
            addCriterion("securities_code like", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeNotLike(String value) {
            addCriterion("securities_code not like", value, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeIn(List<String> values) {
            addCriterion("securities_code in", values, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeNotIn(List<String> values) {
            addCriterion("securities_code not in", values, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeBetween(String value1, String value2) {
            addCriterion("securities_code between", value1, value2, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andSecuritiesCodeNotBetween(String value1, String value2) {
            addCriterion("securities_code not between", value1, value2, "securitiesCode");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusIsNull() {
            addCriterion("delegate_status is null");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusIsNotNull() {
            addCriterion("delegate_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusEqualTo(String value) {
            addCriterion("delegate_status =", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusNotEqualTo(String value) {
            addCriterion("delegate_status <>", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusGreaterThan(String value) {
            addCriterion("delegate_status >", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("delegate_status >=", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusLessThan(String value) {
            addCriterion("delegate_status <", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusLessThanOrEqualTo(String value) {
            addCriterion("delegate_status <=", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusLike(String value) {
            addCriterion("delegate_status like", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusNotLike(String value) {
            addCriterion("delegate_status not like", value, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusIn(List<String> values) {
            addCriterion("delegate_status in", values, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusNotIn(List<String> values) {
            addCriterion("delegate_status not in", values, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusBetween(String value1, String value2) {
            addCriterion("delegate_status between", value1, value2, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegateStatusNotBetween(String value1, String value2) {
            addCriterion("delegate_status not between", value1, value2, "delegateStatus");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryIsNull() {
            addCriterion("delegation_category is null");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryIsNotNull() {
            addCriterion("delegation_category is not null");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryEqualTo(String value) {
            addCriterion("delegation_category =", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryNotEqualTo(String value) {
            addCriterion("delegation_category <>", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryGreaterThan(String value) {
            addCriterion("delegation_category >", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("delegation_category >=", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryLessThan(String value) {
            addCriterion("delegation_category <", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryLessThanOrEqualTo(String value) {
            addCriterion("delegation_category <=", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryLike(String value) {
            addCriterion("delegation_category like", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryNotLike(String value) {
            addCriterion("delegation_category not like", value, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryIn(List<String> values) {
            addCriterion("delegation_category in", values, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryNotIn(List<String> values) {
            addCriterion("delegation_category not in", values, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryBetween(String value1, String value2) {
            addCriterion("delegation_category between", value1, value2, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andDelegationCategoryNotBetween(String value1, String value2) {
            addCriterion("delegation_category not between", value1, value2, "delegationCategory");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseIsNull() {
            addCriterion("entrusted_price_purchase is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseIsNotNull() {
            addCriterion("entrusted_price_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseEqualTo(String value) {
            addCriterion("entrusted_price_purchase =", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseNotEqualTo(String value) {
            addCriterion("entrusted_price_purchase <>", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseGreaterThan(String value) {
            addCriterion("entrusted_price_purchase >", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_price_purchase >=", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseLessThan(String value) {
            addCriterion("entrusted_price_purchase <", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseLessThanOrEqualTo(String value) {
            addCriterion("entrusted_price_purchase <=", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseLike(String value) {
            addCriterion("entrusted_price_purchase like", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseNotLike(String value) {
            addCriterion("entrusted_price_purchase not like", value, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseIn(List<String> values) {
            addCriterion("entrusted_price_purchase in", values, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseNotIn(List<String> values) {
            addCriterion("entrusted_price_purchase not in", values, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseBetween(String value1, String value2) {
            addCriterion("entrusted_price_purchase between", value1, value2, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPricePurchaseNotBetween(String value1, String value2) {
            addCriterion("entrusted_price_purchase not between", value1, value2, "entrustedPricePurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutIsNull() {
            addCriterion("entrusted_price_sellout is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutIsNotNull() {
            addCriterion("entrusted_price_sellout is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutEqualTo(String value) {
            addCriterion("entrusted_price_sellout =", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutNotEqualTo(String value) {
            addCriterion("entrusted_price_sellout <>", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutGreaterThan(String value) {
            addCriterion("entrusted_price_sellout >", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_price_sellout >=", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutLessThan(String value) {
            addCriterion("entrusted_price_sellout <", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutLessThanOrEqualTo(String value) {
            addCriterion("entrusted_price_sellout <=", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutLike(String value) {
            addCriterion("entrusted_price_sellout like", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutNotLike(String value) {
            addCriterion("entrusted_price_sellout not like", value, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutIn(List<String> values) {
            addCriterion("entrusted_price_sellout in", values, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutNotIn(List<String> values) {
            addCriterion("entrusted_price_sellout not in", values, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutBetween(String value1, String value2) {
            addCriterion("entrusted_price_sellout between", value1, value2, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedPriceSelloutNotBetween(String value1, String value2) {
            addCriterion("entrusted_price_sellout not between", value1, value2, "entrustedPriceSellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseIsNull() {
            addCriterion("entrusted_quantity_purchase is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseIsNotNull() {
            addCriterion("entrusted_quantity_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseEqualTo(String value) {
            addCriterion("entrusted_quantity_purchase =", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseNotEqualTo(String value) {
            addCriterion("entrusted_quantity_purchase <>", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseGreaterThan(String value) {
            addCriterion("entrusted_quantity_purchase >", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_quantity_purchase >=", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseLessThan(String value) {
            addCriterion("entrusted_quantity_purchase <", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseLessThanOrEqualTo(String value) {
            addCriterion("entrusted_quantity_purchase <=", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseLike(String value) {
            addCriterion("entrusted_quantity_purchase like", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseNotLike(String value) {
            addCriterion("entrusted_quantity_purchase not like", value, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseIn(List<String> values) {
            addCriterion("entrusted_quantity_purchase in", values, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseNotIn(List<String> values) {
            addCriterion("entrusted_quantity_purchase not in", values, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseBetween(String value1, String value2) {
            addCriterion("entrusted_quantity_purchase between", value1, value2, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantityPurchaseNotBetween(String value1, String value2) {
            addCriterion("entrusted_quantity_purchase not between", value1, value2, "entrustedQuantityPurchase");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutIsNull() {
            addCriterion("entrusted_quantity_sellout is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutIsNotNull() {
            addCriterion("entrusted_quantity_sellout is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutEqualTo(String value) {
            addCriterion("entrusted_quantity_sellout =", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutNotEqualTo(String value) {
            addCriterion("entrusted_quantity_sellout <>", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutGreaterThan(String value) {
            addCriterion("entrusted_quantity_sellout >", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_quantity_sellout >=", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutLessThan(String value) {
            addCriterion("entrusted_quantity_sellout <", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutLessThanOrEqualTo(String value) {
            addCriterion("entrusted_quantity_sellout <=", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutLike(String value) {
            addCriterion("entrusted_quantity_sellout like", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutNotLike(String value) {
            addCriterion("entrusted_quantity_sellout not like", value, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutIn(List<String> values) {
            addCriterion("entrusted_quantity_sellout in", values, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutNotIn(List<String> values) {
            addCriterion("entrusted_quantity_sellout not in", values, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutBetween(String value1, String value2) {
            addCriterion("entrusted_quantity_sellout between", value1, value2, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andEntrustedQuantitySelloutNotBetween(String value1, String value2) {
            addCriterion("entrusted_quantity_sellout not between", value1, value2, "entrustedQuantitySellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseIsNull() {
            addCriterion("date_entrustment_purchase is null");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseIsNotNull() {
            addCriterion("date_entrustment_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseEqualTo(String value) {
            addCriterion("date_entrustment_purchase =", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseNotEqualTo(String value) {
            addCriterion("date_entrustment_purchase <>", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseGreaterThan(String value) {
            addCriterion("date_entrustment_purchase >", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("date_entrustment_purchase >=", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseLessThan(String value) {
            addCriterion("date_entrustment_purchase <", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseLessThanOrEqualTo(String value) {
            addCriterion("date_entrustment_purchase <=", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseLike(String value) {
            addCriterion("date_entrustment_purchase like", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseNotLike(String value) {
            addCriterion("date_entrustment_purchase not like", value, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseIn(List<String> values) {
            addCriterion("date_entrustment_purchase in", values, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseNotIn(List<String> values) {
            addCriterion("date_entrustment_purchase not in", values, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseBetween(String value1, String value2) {
            addCriterion("date_entrustment_purchase between", value1, value2, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentPurchaseNotBetween(String value1, String value2) {
            addCriterion("date_entrustment_purchase not between", value1, value2, "dateEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutIsNull() {
            addCriterion("date_entrustment_sellout is null");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutIsNotNull() {
            addCriterion("date_entrustment_sellout is not null");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutEqualTo(String value) {
            addCriterion("date_entrustment_sellout =", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutNotEqualTo(String value) {
            addCriterion("date_entrustment_sellout <>", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutGreaterThan(String value) {
            addCriterion("date_entrustment_sellout >", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutGreaterThanOrEqualTo(String value) {
            addCriterion("date_entrustment_sellout >=", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutLessThan(String value) {
            addCriterion("date_entrustment_sellout <", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutLessThanOrEqualTo(String value) {
            addCriterion("date_entrustment_sellout <=", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutLike(String value) {
            addCriterion("date_entrustment_sellout like", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutNotLike(String value) {
            addCriterion("date_entrustment_sellout not like", value, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutIn(List<String> values) {
            addCriterion("date_entrustment_sellout in", values, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutNotIn(List<String> values) {
            addCriterion("date_entrustment_sellout not in", values, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutBetween(String value1, String value2) {
            addCriterion("date_entrustment_sellout between", value1, value2, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andDateEntrustmentSelloutNotBetween(String value1, String value2) {
            addCriterion("date_entrustment_sellout not between", value1, value2, "dateEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseIsNull() {
            addCriterion("time_entrustment_purchase is null");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseIsNotNull() {
            addCriterion("time_entrustment_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseEqualTo(String value) {
            addCriterion("time_entrustment_purchase =", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseNotEqualTo(String value) {
            addCriterion("time_entrustment_purchase <>", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseGreaterThan(String value) {
            addCriterion("time_entrustment_purchase >", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("time_entrustment_purchase >=", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseLessThan(String value) {
            addCriterion("time_entrustment_purchase <", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseLessThanOrEqualTo(String value) {
            addCriterion("time_entrustment_purchase <=", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseLike(String value) {
            addCriterion("time_entrustment_purchase like", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseNotLike(String value) {
            addCriterion("time_entrustment_purchase not like", value, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseIn(List<String> values) {
            addCriterion("time_entrustment_purchase in", values, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseNotIn(List<String> values) {
            addCriterion("time_entrustment_purchase not in", values, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseBetween(String value1, String value2) {
            addCriterion("time_entrustment_purchase between", value1, value2, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentPurchaseNotBetween(String value1, String value2) {
            addCriterion("time_entrustment_purchase not between", value1, value2, "timeEntrustmentPurchase");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutIsNull() {
            addCriterion("time_entrustment_sellout is null");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutIsNotNull() {
            addCriterion("time_entrustment_sellout is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutEqualTo(String value) {
            addCriterion("time_entrustment_sellout =", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutNotEqualTo(String value) {
            addCriterion("time_entrustment_sellout <>", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutGreaterThan(String value) {
            addCriterion("time_entrustment_sellout >", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutGreaterThanOrEqualTo(String value) {
            addCriterion("time_entrustment_sellout >=", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutLessThan(String value) {
            addCriterion("time_entrustment_sellout <", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutLessThanOrEqualTo(String value) {
            addCriterion("time_entrustment_sellout <=", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutLike(String value) {
            addCriterion("time_entrustment_sellout like", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutNotLike(String value) {
            addCriterion("time_entrustment_sellout not like", value, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutIn(List<String> values) {
            addCriterion("time_entrustment_sellout in", values, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutNotIn(List<String> values) {
            addCriterion("time_entrustment_sellout not in", values, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutBetween(String value1, String value2) {
            addCriterion("time_entrustment_sellout between", value1, value2, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andTimeEntrustmentSelloutNotBetween(String value1, String value2) {
            addCriterion("time_entrustment_sellout not between", value1, value2, "timeEntrustmentSellout");
            return (Criteria) this;
        }

        public Criteria andBondYieldIsNull() {
            addCriterion("bond_yield is null");
            return (Criteria) this;
        }

        public Criteria andBondYieldIsNotNull() {
            addCriterion("bond_yield is not null");
            return (Criteria) this;
        }

        public Criteria andBondYieldEqualTo(String value) {
            addCriterion("bond_yield =", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldNotEqualTo(String value) {
            addCriterion("bond_yield <>", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldGreaterThan(String value) {
            addCriterion("bond_yield >", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldGreaterThanOrEqualTo(String value) {
            addCriterion("bond_yield >=", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldLessThan(String value) {
            addCriterion("bond_yield <", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldLessThanOrEqualTo(String value) {
            addCriterion("bond_yield <=", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldLike(String value) {
            addCriterion("bond_yield like", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldNotLike(String value) {
            addCriterion("bond_yield not like", value, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldIn(List<String> values) {
            addCriterion("bond_yield in", values, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldNotIn(List<String> values) {
            addCriterion("bond_yield not in", values, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldBetween(String value1, String value2) {
            addCriterion("bond_yield between", value1, value2, "bondYield");
            return (Criteria) this;
        }

        public Criteria andBondYieldNotBetween(String value1, String value2) {
            addCriterion("bond_yield not between", value1, value2, "bondYield");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorIsNull() {
            addCriterion("whether_monitor is null");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorIsNotNull() {
            addCriterion("whether_monitor is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorEqualTo(String value) {
            addCriterion("whether_monitor =", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorNotEqualTo(String value) {
            addCriterion("whether_monitor <>", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorGreaterThan(String value) {
            addCriterion("whether_monitor >", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorGreaterThanOrEqualTo(String value) {
            addCriterion("whether_monitor >=", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorLessThan(String value) {
            addCriterion("whether_monitor <", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorLessThanOrEqualTo(String value) {
            addCriterion("whether_monitor <=", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorLike(String value) {
            addCriterion("whether_monitor like", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorNotLike(String value) {
            addCriterion("whether_monitor not like", value, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorIn(List<String> values) {
            addCriterion("whether_monitor in", values, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorNotIn(List<String> values) {
            addCriterion("whether_monitor not in", values, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorBetween(String value1, String value2) {
            addCriterion("whether_monitor between", value1, value2, "whetherMonitor");
            return (Criteria) this;
        }

        public Criteria andWhetherMonitorNotBetween(String value1, String value2) {
            addCriterion("whether_monitor not between", value1, value2, "whetherMonitor");
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