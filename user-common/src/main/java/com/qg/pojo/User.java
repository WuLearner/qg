package com.qg.pojo;

import java.io.Serializable;

/**
 * provider 和 consumer 都要使用的 module
 */
public class User implements Serializable{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
