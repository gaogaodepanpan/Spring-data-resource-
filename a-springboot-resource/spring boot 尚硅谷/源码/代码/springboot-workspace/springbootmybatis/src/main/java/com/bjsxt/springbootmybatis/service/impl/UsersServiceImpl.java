package com.bjsxt.springbootmybatis.service.impl;

import com.bjsxt.springbootmybatis.mapper.UsersMapper;
import com.bjsxt.springbootmybatis.pojo.Users;
import com.bjsxt.springbootmybatis.pojo.UsersExample;
import com.bjsxt.springbootmybatis.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;


    /**
     * 添加用户
     * @param users
     */
    @Override
    @Transactional
    public void addUsers(Users users) {
        this.usersMapper.insert(users);
    }


    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<Users> findUserAll() {
        UsersExample example = new UsersExample();
        return this.usersMapper.selectByExample(example);
    }

    /**
     * 预更新查询
     * @param id
     * @return
     */
    @Override
    public Users preUpdateUsers(Integer id) {
        return this.usersMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新用户
     * @param users
     */
    @Override
    @Transactional
    public void modifyUsers(Users users) {
        this.usersMapper.updateByPrimaryKey(users);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    @Transactional
    public void dropUsersById(Integer id) {
        this.usersMapper.deleteByPrimaryKey(id);
    }
}
