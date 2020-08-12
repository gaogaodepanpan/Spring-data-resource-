package com.bjsxt.springbootexcepionandjunit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl {

    public void insert(){
        System.out.println("insert into users values......");
    }
}
