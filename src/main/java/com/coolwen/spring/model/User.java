package com.coolwen.spring.model;/**
 * Created by CoolWen on 2017/9/21.
 */

/**
 * @author CoolWen
 * @version 2017-09-21 10:45
 */
public class User {
    private int id;
    private String username;



    public User() {
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

}
