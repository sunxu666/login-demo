package com.sunxu.login.demo.dao.impl;

import com.sunxu.login.demo.dao.UserDao;
import com.sunxu.login.demo.entity.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈dao方法实现〉
 *
 * @author sunxu
 * @create 2019/3/3
 * @since 1.0.0
 */
public class UserDaoImpl implements UserDao {
    /**
     * 用户登录
     *
     * @param loginId       登录Id
     * @param loginPassword 登录密码
     * @return String 登录结果
     */
    public User login(String loginId, String loginPassword) {
        User user = null;
        //直接根据LoginId 查询出这个用户信息
        if("admin".equals(loginId)){
            if( "admin".equals(loginPassword)){
                //再根据传入的密码进行匹配
                user = new User();
                user.setLoginId("admin");
                user.setLoginPassword("admin");
                user.setUsername("sunxu");
            }
        }
        return user;
    }
}
