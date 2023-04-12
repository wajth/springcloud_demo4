package com.example.consumer_server_12000.po;

public class User{
    private final Integer userId;
    private final String name;
    private final String password;

    public User(Integer userId, String name, String password) {
        this.userId=userId;
        this.name=name;
        this.password=password;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

}
