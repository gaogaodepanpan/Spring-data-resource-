package com.bjsxt.springbootexcepionandjunit.service;


import com.bjsxt.springbootexcepionandjunit.dao.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl {

    @Autowired
    private UsersDaoImpl usersDao;

    public void addUser(){
        this.usersDao.insert();
    }
}
