package com.sunxu.login.demo.service;

import com.sunxu.login.demo.entity.User;

/**
 * @Description:〈一句话功能简述〉<br>
 * @Auther: sunxu
 * @Date: 2019/3/3 18:08
 */
public interface UserService {

    public User login(String loginId,String loginPassword);
}
