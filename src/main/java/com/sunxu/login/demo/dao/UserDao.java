package com.sunxu.login.demo.dao;

import com.sunxu.login.demo.entity.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户数据访问〉
 *
 * @author sunxu
 * @create 2019/3/3
 * @since 1.0.0
 */
public interface UserDao {
    public User login(String loginId, String loginPassword);
}
