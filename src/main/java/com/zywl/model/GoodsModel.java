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

    private String productData;

    private String houseType;

    private String detailPic;

    private double lotteryPrice;

    //参与人数
    private Integer numberPeople;


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

    public String getProductData() {
        return productData;
    }

    public void setProductData(String productData) {
        this.productData = productData;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(String detailPic) {
        this.detailPic = detailPic;
    }

    public double getLotteryPrice() {
        return lotteryPrice;
    }

    public void setLotteryPrice(double lotteryPrice) {
        this.lotteryPrice = lotteryPrice;
    }

    public Integer getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(Integer numberPeople) {
        this.numberPeople = numberPeople;
    }
}
