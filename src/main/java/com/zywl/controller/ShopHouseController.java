package com.zywl.controller;

import com.zywl.model.GoodsModel;
import com.zywl.model.ResultData;
import com.zywl.model.ShopHouseModel;
import com.zywl.model.SnatchOrderModel;
import com.zywl.service.GoodsService;
import com.zywl.service.ShopHouseService;
import com.zywl.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/shop/house")
@Controller
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
    public String getData(@ModelAttribute ShopHouseModel model) {
        try {
            return shopHouseService.getHouseList(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * app展示参加一元夺宝的商品
     * @param model
     * @return
     */
    @RequestMapping(value = "/getShop", method = RequestMethod.POST)
    @ResponseBody
    public String getShop(@ModelAttribute GoodsModel model) {
        try {
            return goodsService.getShopList(model).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.toErrorString();
        }
    }

    /**
     * app一元夺宝的商品详情
     * @param model
     * @return
     */
    @RequestMapping(value = "/getShopDetail", method = RequestMethod.POST)
    @ResponseBody
    public String getShopDetail(@ModelAttribute GoodsModel model) {
        try {
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
    public String add(@ModelAttribute SnatchOrderModel model) {
        goodsService.insertSnatch(model);
        return ResultData.toSuccessDataObj(model);
    }



}
