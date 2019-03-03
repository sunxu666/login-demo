package com.sunxu.login.demo.service.impl;

import com.sunxu.login.demo.dao.UserDao;
import com.sunxu.login.demo.dao.impl.UserDaoImpl;
import com.sunxu.login.demo.entity.User;
import com.sunxu.login.demo.service.UserService;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户服务〉
 *
 * @author sunxu
 * @create 2019/3/3
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    /**
     *
     * @param loginId
     * @param loginPassword
     * @return
     */
    public User login(String loginId, String loginPassword) {
         return  userDao.login(loginId,loginPassword);
    }
}
