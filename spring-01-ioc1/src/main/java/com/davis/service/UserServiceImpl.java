package com.davis.service;

import com.davis.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
