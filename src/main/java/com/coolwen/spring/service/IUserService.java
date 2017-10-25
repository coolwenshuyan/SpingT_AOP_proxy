package com.coolwen.spring.service;/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.model.User;

/**
 * @author CoolWen
 * @version 2017-09-21 10:51
 */
public interface IUserService {
    public void add(User user);

    public void load(int id);
}
