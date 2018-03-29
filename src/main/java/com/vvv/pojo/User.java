package com.vvv.pojo;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * Created by vvv on 2018/3/29.
 */
public class User {
    private Integer id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    private String password;
    private Integer role;
    /*public User(int id,String userId,String password,int role){
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.role = role;
    }*/



}
