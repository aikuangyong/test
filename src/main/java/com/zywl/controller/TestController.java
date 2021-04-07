package com.zywl.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    protected static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        logger.info("===系统调用了TestController3===");
        return "HelloWorld";
    }
}
