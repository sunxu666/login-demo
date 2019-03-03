package com.sunxu.login.demo.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户表〉
 *  Serializable因为数据需要传输所以需要序列化（序列化成二进制）
 * @author sunxu
 * @create 2019/3/3
 * @since 1.0.0
 */
public class User implements Serializable {
    private String username;
    private String loginId;
    private String loginPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
