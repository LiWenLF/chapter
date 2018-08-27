package com.faisco.constant;

import com.faisco.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/7/5.
 */
public class Constant {
    public static List<User> userList = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("admin");
            user.setPassWord("pawd");
            userList.add(user);
        }
    }
}
