package com.zywl.controller;

import com.zywl.model.GoodsModel;
import com.zywl.model.ResultData;
import com.zywl.model.ShopHouseModel;
import com.zywl.model.SnatchOrderModel;
import com.zywl.service.GoodsService;
import com.zywl.service.ShopHouseService;
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

@RequestMapping("/shop/house")
@Controller
@Api(value = "一元购相关接口", tags = "一元购")
public class ShopHouseController extends BaseController {

    @Autowired
    private ShopHouseService shopHouseService;

    @Autowired
    private GoodsService goodsService;

    /**
     * app店铺展示
     * @param model
     * @return
     */
    @RequestMapping(value = "/getData", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "app店铺展示列表", notes = "app店铺展示列表")
    public String getData(@ModelAttribute ShopHouseModel model) {
        try {
            return shopHouseService.getHouseList(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * app展示店铺下的商品
     * @param houseId
     * @return
     */
    @RequestMapping(value = "/getHouseShop", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "展示店铺下的商品", notes = "展示店铺下的商品")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "int", name = "houseId", defaultValue = "1", value = "店铺ID", required = true)})
    public String getHouseShop(int houseId) {
        try {
            GoodsModel model = new GoodsModel();
            model.setHouseId(houseId);
            return goodsService.getShopList(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * app展示参加一元夺宝的商品
     * @param isOne
     * @return
     */
    @RequestMapping(value = "/getShop", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "展示参加一元夺宝的商品", notes = "展示参加一元夺宝的商品")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "int", name = "isOne", defaultValue = "1", value = "是否一元夺宝商品", required = true)})
    public String getShop(int isOne) {
        try {
            GoodsModel model = new GoodsModel();
            model.setIsOne(isOne);
            return goodsService.getShopList(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * app一元夺宝的商品详情
     * @param goodsId
     * @return
     */
    @RequestMapping(value = "/getShopDetail", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "一元夺宝的商品详情", notes = "一元夺宝的商品详情")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "query", dataType = "int", name = "goodsId", defaultValue = "1", value = "商品ID", required = true)})
    public String getShopDetail(int goodsId) {
        try {
            GoodsModel model = new GoodsModel();
            model.setGoodsId(goodsId);
            return goodsService.getShopDetail(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * 记录一元夺宝的商品和参与者
     * @param model
     * @return
     */
    @RequestMapping(value = "/saveSnatch", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "记录一元夺宝的商品和参与者", notes = "记录一元夺宝的商品和参与者")
    public String add(@ModelAttribute SnatchOrderModel model) {
        goodsService.insertSnatch(model);
        return ResultData.toSuccessDataObj(model);
    }



}
