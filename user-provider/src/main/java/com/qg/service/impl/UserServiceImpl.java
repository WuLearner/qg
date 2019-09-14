package com.qg.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qg.mapper.UserMapper;
import com.qg.pojo.User;
import com.qg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> querUserList() {
        return userMapper.querUserList();
    }
}
