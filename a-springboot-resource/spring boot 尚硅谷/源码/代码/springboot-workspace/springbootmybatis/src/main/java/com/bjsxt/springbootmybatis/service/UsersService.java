package com.bjsxt.springbootmybatis.service;

import com.bjsxt.springbootmybatis.pojo.Users;

import java.util.List;

public interface UsersService {
    void addUsers(Users users);
    List<Users> findUserAll();
    Users preUpdateUsers(Integer id);
    void modifyUsers(Users users);
    void dropUsersById(Integer id);
}
