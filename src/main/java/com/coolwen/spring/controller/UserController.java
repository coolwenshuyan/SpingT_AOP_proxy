package com.coolwen.spring.controller;/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.model.User;
import com.coolwen.spring.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CoolWen
 * @version 2017-09-21 10:54
 */
@Controller
public class UserController {
    private IUserService userService;
    private User user;
    private int id;


    public void add() {

        userService.add(user);
    }

    public void load() {
        userService.load(id);
    }

    public IUserService getUserService() {
        return userService;
    }

    @Resource
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public UserController(IUserService userService) {
//        this.userService = userService;
//    }



}
