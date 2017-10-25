package com.coolwen.spring.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by CoolWen on 2017/10/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInFor {
    public String value() default "";
}
