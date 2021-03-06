package com.huatec.hiot_cloud.test.networktest;

import java.io.Serializable;

/**
 * 用户对象
 */
public class UserBean implements Serializable {

    /**
     * 用户名
     */
    private String username;

    private String email;

    private String password;

    private String userType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
