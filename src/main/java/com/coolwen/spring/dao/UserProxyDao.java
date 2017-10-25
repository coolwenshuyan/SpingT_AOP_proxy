package com.coolwen.spring.dao;/**
 * Created by CoolWen on 2017/10/12.
 */

import com.coolwen.spring.model.Log;
import com.coolwen.spring.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author CoolWen
 * @version 2017-10-12 9:23
 */
@Repository("userProxyDao")
public class UserProxyDao implements IUserDao {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }
    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        Log.log("User add");
        userDao.add(user);
    }

    @Override
    public User Load(int id) {
        Log.log("user load");
        userDao.Load(id);
        return null;
    }
}
