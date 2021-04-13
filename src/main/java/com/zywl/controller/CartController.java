package com.zywl.controller;


import com.zywl.model.CartModel;
import com.zywl.model.ResultData;
import com.zywl.service.CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/shop/cart")
@Controller
@Api(value = "购物车相关接口", tags = "购物车")
public class CartController extends BaseController {

    @Autowired
    private CartService cartService;


    @RequestMapping(value = "/addCart", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "加入购物车", notes = "加入购物车")
    public String addCart(@ModelAttribute CartModel model) {
        cartService.insertCart(model);
        return ResultData.toSuccessDataObj(model);
    }


    @RequestMapping(value = "/getCart", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询购物车", notes = "查询购物车")
    public String getCart(@ModelAttribute CartModel model) {
        try {
            return cartService.getGoodCart(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "从购物车删除商品", notes = "从购物车删除商品")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "String", name = "ids", defaultValue = "1", value = "购物车ID", required = true)})
    public String batchDelete(String ids) {
        List<String> idList = Arrays.asList(ids.split(","));
        return cartService.batchDelete(idList);
    }


}
