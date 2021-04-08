package com.zywl.model;

/**
 * 商品bean
 */
public class GoodsModel extends PageModel {

    private Integer goodsId;

    private String goodsName;

    private double goodsPrice;

    private String goodsPic;

    private Integer houseId;

    private Integer isOne;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getIsOne() {
        return isOne;
    }

    public void setIsOne(Integer isOne) {
        this.isOne = isOne;
    }
}
