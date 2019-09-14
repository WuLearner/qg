package com.qg.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qg.pojo.User;
import com.qg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Reference
    private UserService userService;

    /***
     * 测试的入口类
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public List<User> hello() {
        return userService.querUserList();
    }
}
