package com.coolwen.spring.dao;/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.model.Log;
import com.coolwen.spring.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author CoolWen
 * @version 2017-09-21 10:48
 */
@Repository("userDao")
public class UserDao implements IUserDao {
    @Override
    public void add(User user) {
 //       Log.log("User add");
        System.out.println("add user:" + user);
    }

    @Override
    public User Load(int id) {
  //      Log.log("User load");
        System.out.println("load user:" + id);
        return null;
    }
}
