package com.davis.demo02;

public class client {
    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();

    }
}
