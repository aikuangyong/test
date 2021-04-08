package com.zywl.service;

import com.alibaba.fastjson.JSON;
import com.zywl.dao.GoodsMapper;
import com.zywl.model.GoodsModel;
import com.zywl.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public ResultData getShopList(GoodsModel model) {
        ResultData returnData = new ResultData();
        List<GoodsModel> dataList = goodsMapper.getList(model);
        returnData.setState("SUCCESS");
        returnData.setSuccess(true);
        returnData.setDataList(JSON.toJSONString(dataList));
        int dataCount = this.getCount(model);
        returnData.setPageCount(dataCount, model.getPageSize());
        returnData.setDataCount(dataCount);
        returnData.setPageNumber(model.getPageNumber());
        return returnData;
    }

    public int getCount(GoodsModel model) {
        return goodsMapper.getCount(model);
    }


}
