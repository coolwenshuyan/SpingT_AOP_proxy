package com.coolwen.spring.dao;/**
 * Created by CoolWen on 2017/10/12.
 */

import com.coolwen.spring.model.Log;
import com.coolwen.spring.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author CoolWen
 * @version 2017-10-12 9:20
 */
@Repository("orderDao")
public class OrderDao implements IOrderDao {
    @Override
    public void add() {
        Log.log("o add");
        System.out.println("Order add");
    }

    @Override
    public User Load() {
        Log.log("o load");
        System.out.println("Order load");
        return null;
    }
}
