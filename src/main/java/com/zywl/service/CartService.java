package com.zywl.service;

import com.alibaba.fastjson.JSON;
import com.zywl.dao.CartMapper;
import com.zywl.model.CartModel;
import com.zywl.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartService {

    @Autowired
    private CartMapper cartMapper;

    public CartModel insertCart(CartModel model) {
        cartMapper.insertCart(model);
        return model;
    }

    public ResultData getGoodCart(CartModel model) {
        ResultData returnData = new ResultData();
        List<CartModel> dataList = cartMapper.getGoodCart(model);
        returnData.setState("SUCCESS");
        returnData.setSuccess(true);
        returnData.setDataList(JSON.toJSONString(dataList));
        return returnData;
    }

    public String batchDelete(List<String> idList) {
        cartMapper.delete(idList);
        return ResultData.toSuccessString();
    }

}
