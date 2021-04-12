package com.zywl.dao;

import com.zywl.model.CartModel;
import com.zywl.model.GoodsModel;
import com.zywl.model.SnatchOrderModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("goodsDao")
public interface GoodsMapper {

    public List<GoodsModel> getList(GoodsModel model);

    public int getCount(GoodsModel model);

    public GoodsModel getGoodDetail(GoodsModel model);

    public void insertSnatch(SnatchOrderModel model);

    public int getSnatchCount(GoodsModel model);

    public void insertCart(CartModel model);


}
