package com.zywl.model;

import java.util.Date;

/**
 * 夺宝订单bean
 */
public class SnatchOrderModel {

    private Integer snatchId;

    private Integer goodsId;

    private Integer userId;

    public Integer getSnatchId() {
        return snatchId;
    }

    public void setSnatchId(Integer snatchId) {
        this.snatchId = snatchId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
