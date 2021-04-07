package com.zywl.dao;

import com.zywl.model.ShopHouseModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("shopHouseDao")
public interface ShopHouseMapper {


    public List<ShopHouseModel> getList(ShopHouseModel model);


    public int getCount(ShopHouseModel model);

}
