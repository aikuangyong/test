package com.zywl.vo;

import com.zywl.model.GoodsModel;

import java.util.List;

/**
 * 店铺VO
 */
public class ShopHouseVO {

    private Integer houseId;

    private String houseName;

    private String houseIcon;

    private String credibility;

    private String housePhone;

    private String banner;

    private List<GoodsModel> goods;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseIcon() {
        return houseIcon;
    }

    public void setHouseIcon(String houseIcon) {
        this.houseIcon = houseIcon;
    }

    public String getCredibility() {
        return credibility;
    }

    public void setCredibility(String credibility) {
        this.credibility = credibility;
    }

    public String getHousePhone() {
        return housePhone;
    }

    public void setHousePhone(String housePhone) {
        this.housePhone = housePhone;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public List<GoodsModel> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsModel> goods) {
        this.goods = goods;
    }
}
