package com.qg.controller;

import com.qg.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/test")
    public String test(){
        redisUtil.setStr("qg-key","test");
        return redisUtil.getStr("qg-key");
    }
}
