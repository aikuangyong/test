package com.zywl.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 夺宝订单bean
 */
public class SnatchOrderModel {

    private Integer snatchId;

    @ApiModelProperty(value = "商品ID", required = true)
    private Integer goodsId;

    @ApiModelProperty(value = "用户ID", required = true)
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
