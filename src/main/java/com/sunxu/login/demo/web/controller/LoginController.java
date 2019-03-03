package com.sunxu.login.demo.web.controller;

import com.sunxu.login.demo.entity.User;
import com.sunxu.login.demo.service.UserService;
import com.sunxu.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈登录控制器〉
 *
 * @author sunxu
 * @create 2019/3/3
 * @since 1.0.0
 */
public class LoginController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPassword = req.getParameter("loginPassword");

        User user = userService.login(loginId, loginPassword);
        //登录失败的处理
        if (user == null) {
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
        //登录失败的处理
        else {
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }


    }
}
