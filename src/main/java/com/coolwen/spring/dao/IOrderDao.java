package com.coolwen.spring.dao;/**
 * Created by CoolWen on 2017/10/12.
 */

import com.coolwen.spring.model.User;

/**
 * @author CoolWen
 * @version 2017-10-12 9:20
 */
public interface IOrderDao {
    public void add();
    public User Load();
}
