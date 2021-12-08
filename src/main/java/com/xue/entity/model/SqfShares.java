package com.xue.entity.model;

import java.io.Serializable;

public class SqfShares implements Serializable {
    private Integer id;

    private String securitiesName;

    private String securitiesCode;

    private String delegateStatus;

    private String delegationCategory;

    private String entrustedPricePurchase;

    private String entrustedPriceSellout;

    private String entrustedQuantityPurchase;

    private String entrustedQuantitySellout;

    private String dateEntrustmentPurchase;

    private String dateEntrustmentSellout;

    private String timeEntrustmentPurchase;

    private String timeEntrustmentSellout;

    private String bondYield;

    private String whetherMonitor;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecuritiesName() {
        return securitiesName;
    }

    public void setSecuritiesName(String securitiesName) {
        this.securitiesName = securitiesName;
    }

    public String getSecuritiesCode() {
        return securitiesCode;
    }

    public void setSecuritiesCode(String securitiesCode) {
        this.securitiesCode = securitiesCode;
    }

    public String getDelegateStatus() {
        return delegateStatus;
    }

    public void setDelegateStatus(String delegateStatus) {
        this.delegateStatus = delegateStatus;
    }

    public String getDelegationCategory() {
        return delegationCategory;
    }

    public void setDelegationCategory(String delegationCategory) {
        this.delegationCategory = delegationCategory;
    }

    public String getEntrustedPricePurchase() {
        return entrustedPricePurchase;
    }

    public void setEntrustedPricePurchase(String entrustedPricePurchase) {
        this.entrustedPricePurchase = entrustedPricePurchase;
    }

    public String getEntrustedPriceSellout() {
        return entrustedPriceSellout;
    }

    public void setEntrustedPriceSellout(String entrustedPriceSellout) {
        this.entrustedPriceSellout = entrustedPriceSellout;
    }

    public String getEntrustedQuantityPurchase() {
        return entrustedQuantityPurchase;
    }

    public void setEntrustedQuantityPurchase(String entrustedQuantityPurchase) {
        this.entrustedQuantityPurchase = entrustedQuantityPurchase;
    }

    public String getEntrustedQuantitySellout() {
        return entrustedQuantitySellout;
    }

    public void setEntrustedQuantitySellout(String entrustedQuantitySellout) {
        this.entrustedQuantitySellout = entrustedQuantitySellout;
    }

    public String getDateEntrustmentPurchase() {
        return dateEntrustmentPurchase;
    }

    public void setDateEntrustmentPurchase(String dateEntrustmentPurchase) {
        this.dateEntrustmentPurchase = dateEntrustmentPurchase;
    }

    public String getDateEntrustmentSellout() {
        return dateEntrustmentSellout;
    }

    public void setDateEntrustmentSellout(String dateEntrustmentSellout) {
        this.dateEntrustmentSellout = dateEntrustmentSellout;
    }

    public String getTimeEntrustmentPurchase() {
        return timeEntrustmentPurchase;
    }

    public void setTimeEntrustmentPurchase(String timeEntrustmentPurchase) {
        this.timeEntrustmentPurchase = timeEntrustmentPurchase;
    }

    public String getTimeEntrustmentSellout() {
        return timeEntrustmentSellout;
    }

    public void setTimeEntrustmentSellout(String timeEntrustmentSellout) {
        this.timeEntrustmentSellout = timeEntrustmentSellout;
    }

    public String getBondYield() {
        return bondYield;
    }

    public void setBondYield(String bondYield) {
        this.bondYield = bondYield;
    }

    public String getWhetherMonitor() {
        return whetherMonitor;
    }

    public void setWhetherMonitor(String whetherMonitor) {
        this.whetherMonitor = whetherMonitor;
    }
}