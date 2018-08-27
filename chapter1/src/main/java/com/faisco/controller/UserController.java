package com.faisco.controller;

import com.faisco.constant.Constant;
import com.faisco.model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2018/7/5.
 */
@Slf4j
@RestController
public class UserController {
    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public User findOneUser(@PathVariable("id") int id) {
        log.info("hello world");
        log.debug("hello world test");
        log.error("hello world2");
        System.out.print("hello wor2");
        return Constant.userList.get(id);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<User> findAllCity() {
        return Constant.userList;
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public List<User> createUser(User user) {
        Constant.userList.add(user);
        return Constant.userList;
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public List<User> updateUser(@RequestBody User user) {
        System.out.print(user.toString());
        Constant.userList.set(user.getId(), user);
        return Constant.userList;
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public List<User> modifyCity(@PathVariable("id") int id) {
        Constant.userList.remove(id);
        return Constant.userList;
    }

}
