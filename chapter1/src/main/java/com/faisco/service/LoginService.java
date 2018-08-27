package com.faisco.service;


import com.faisco.model.User;

/**
 * Created by admin on 2018/8/27.
 */
public interface LoginService {
    User doLogin(String userName, String passWord);
}
