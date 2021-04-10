package com.zywl.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/shop/cart")
@Controller
@Api(value = "购物车相关接口", tags = "购物车")
public class CartController extends BaseController {


    protected static final Logger logger = LoggerFactory.getLogger(CartController.class);

    @RequestMapping(value = "/addCart", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "加入购物车", notes = "加入购物车")
    public String addCart() {
        logger.info("===系统调用了TestController3===");
        return "HelloWorld";
    }
}
