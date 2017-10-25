package com.coolwen.spring.service;/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.dao.IOrderDao;
import com.coolwen.spring.dao.IUserDao;
import com.coolwen.spring.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CoolWen
 * @version 2017-09-21 10:52
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;
    private IOrderDao orderDao;
//   private IUserDao jDBCuserDao;

    @Override
    public void add(User user) {

        userDao.add(user);
        orderDao.Load();
        orderDao.add();
    }

    @Override
    public void load(int id) {
        userDao.Load(id);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    @Resource(name = "userDynamicDao")
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public IOrderDao getOrderDao() {
        return orderDao;
    }

    @Resource(name = "orderDynamicDao")
    public void setOrderDao(IOrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
