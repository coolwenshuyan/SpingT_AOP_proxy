package com.coolwen.spring.proxy;/**
 * Created by CoolWen on 2017/10/12.
 */

import com.coolwen.spring.model.Log;
import com.coolwen.spring.model.LogInFor;
import sun.security.jca.GetInstance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author CoolWen
 * @version 2017-10-12 9:59
 */
public class LogProxy implements InvocationHandler {

    private Object target;

    public static Object getInstance(Object o) {
        LogProxy proxy = new LogProxy();
        proxy.target = o;
        Object result = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), proxy);
        return result;
    }

    /**
     * 当有了代理对象之后，不管这个代理对象执行什么方法，都会调用以下的invoke方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (method.getName().equals("add")) {
//            Log.log("执行了操作");
//        }
        if (method.isAnnotationPresent(LogInFor.class)) {
            Log.log("执行了操作");
        }
        Object obj = method.invoke(target, args);
        return obj;
    }
}
