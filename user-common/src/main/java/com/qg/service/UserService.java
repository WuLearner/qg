package com.qg.service;

import com.qg.pojo.User;

import java.util.List;

/***
 * User 业务接口
 */
public interface UserService {
    /***
     * 查询用户列表的方法
     * @return
     */
    public List<User> querUserList();
}
