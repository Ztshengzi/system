package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServive")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser(){
        return userMapper.selectAllUser();
    }

    @Override
    public User selectUser(Integer id) {

        return userMapper.selectUser(id);
    }

    @Override
    public Page<User> selectUserByPage(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectUserByPage();
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer updateUser(Integer id, Integer age) {
        return userMapper.updateUser(id, age);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
}
