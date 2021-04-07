package com.zywl.service;

import com.alibaba.fastjson.JSON;
import com.zywl.dao.GoodsMapper;
import com.zywl.dao.ShopHouseMapper;
import com.zywl.model.GoodsModel;
import com.zywl.model.ResultData;
import com.zywl.model.ShopHouseModel;
import com.zywl.vo.ShopHouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("shopHouseService")
public class ShopHouseService {

    @Autowired
    private ShopHouseMapper shopHouseMapper;

    @Autowired
    private GoodsMapper goodsMapper;


    public ResultData getHouseList(ShopHouseModel model) {
        ResultData returnData = new ResultData();
        List<ShopHouseModel> houseList = shopHouseMapper.getList(model);
        List<ShopHouseVO> dataList = new ArrayList<>();
        if(houseList.size()>0){
            for(int i=0;i<houseList.size();i++){
                ShopHouseVO vo = new ShopHouseVO();
                vo.setCredibility(houseList.get(i).getCredibility());
                vo.setHouseId(houseList.get(i).getHouseId());
                vo.setHouseName(houseList.get(i).getHouseName());
                vo.setHouseIcon(houseList.get(i).getHouseIcon());
                vo.setHousePhone(houseList.get(i).getHousePhone());
                vo.setBanner(houseList.get(i).getBanner());
                GoodsModel goodsModel = new GoodsModel();
                goodsModel.setHouseId(vo.getHouseId());
                List<GoodsModel> goodsList = goodsMapper.getList(goodsModel);
                vo.setGoods(goodsList);
                dataList.add(vo);
            }
        }
        returnData.setState("SUCCESS");
        returnData.setSuccess(true);
        returnData.setDataList(JSON.toJSONString(dataList));
        int dataCount = this.getCount(model);
        returnData.setPageCount(dataCount, model.getPageSize());
        returnData.setDataCount(dataCount);
        returnData.setPageNumber(model.getPageNumber());
        return returnData;
    }

    public int getCount(ShopHouseModel model) {
        return shopHouseMapper.getCount(model);
    }


}
