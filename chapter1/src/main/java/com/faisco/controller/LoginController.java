package com.faisco.controller;

import com.faisco.model.User;
import com.faisco.service.LoginService;
import com.faisco.util.Result;
import com.faisco.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2018/8/27.
 */
@Slf4j
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public Result doLogin(HttpServletRequest request) {
        String name = request.getParameter("name");
        String passWord = request.getParameter("pwd");
        User u = loginService.doLogin(name, passWord);
        return  ResultUtil.success(u);
    }
}
