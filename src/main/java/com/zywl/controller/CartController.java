package com.zywl.controller;


import com.zywl.model.CartModel;
import com.zywl.model.ResultData;
import com.zywl.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/shop/cart")
@Controller
@Api(value = "购物车相关接口", tags = "购物车")
public class CartController extends BaseController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping(value = "/addCart", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "加入购物车", notes = "加入购物车")
    public String addCart(@ModelAttribute CartModel model) {
        goodsService.insertCart(model);
        return ResultData.toSuccessDataObj(model);
    }
}
