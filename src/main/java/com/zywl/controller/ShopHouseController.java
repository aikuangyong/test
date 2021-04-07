package com.zywl.controller;

import com.zywl.model.ResultData;
import com.zywl.model.ShopHouseModel;
import com.zywl.service.ShopHouseService;
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



}
