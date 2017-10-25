package com.coolwen.spring.dao;/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.model.LogInFor;
import com.coolwen.spring.model.User;

/**
 * @author CoolWen
 * @version 2017-09-21 10:47
 */
public interface IUserDao {
    @LogInFor("添加了用户")
    public void add(User user);
    public User Load(int id);
}
