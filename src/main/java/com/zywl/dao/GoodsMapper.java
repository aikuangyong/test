package com.zywl.dao;

import com.zywl.model.GoodsModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("goodsDao")
public interface GoodsMapper {

    public List<GoodsModel> getList(GoodsModel model);

    public int getCount(GoodsModel model);

}
