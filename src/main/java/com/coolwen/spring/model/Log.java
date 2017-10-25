package com.coolwen.spring.model;/**
 * Created by CoolWen on 2017/10/12.
 */

import java.util.Date;

/**
 * @author CoolWen
 * @version 2017-10-12 9:16
 */
public class Log {
    public static void log(String infor){
        System.out.println(new Date() + "---->" + infor);
    }
}
