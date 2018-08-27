package com.faisco.serviceImpl;


import com.faisco.model.User;
import com.faisco.repository.UserRepository;
import com.faisco.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/8/27.
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User doLogin(String userName, String passWord) {
        return userRepository.findByUserAndPwd(userName, passWord).get(0);
    }
}

