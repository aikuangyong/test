package com.zywl.service;

import com.alibaba.fastjson.JSON;
import com.zywl.dao.GoodsMapper;
import com.zywl.model.CartModel;
import com.zywl.model.GoodsModel;
import com.zywl.model.ResultData;
import com.zywl.model.SnatchOrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

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

    public ResultData getShopDetail(GoodsModel model) {
        ResultData returnData = new ResultData();
        GoodsModel goodsModel = goodsMapper.getGoodDetail(model);
        //查询参与一元夺宝的人数
        int numberPeople = goodsMapper.getSnatchCount(model);
        goodsModel.setNumberPeople(numberPeople);
        returnData.setState("SUCCESS");
        returnData.setSuccess(true);
        returnData.setDataObj(JSON.toJSONString(goodsModel));
        return returnData;
    }


    public SnatchOrderModel insertSnatch(SnatchOrderModel model) {
        goodsMapper.insertSnatch(model);
        return model;
    }


    /**
     * 一元夺宝中奖者编号
     * @param total 商品的总参与人数
     * @return
     */
    public int getRandom(int total){
        Random rd=new Random();
        int a = rd.nextInt(total);  //参数填写多少就是1-多少的随机数
        return a;
    }


}
