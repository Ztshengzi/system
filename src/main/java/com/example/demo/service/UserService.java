package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Login;
import com.example.demo.entity.User;
import com.github.pagehelper.Page;

public interface UserService {
    public List<User> selectAllUser();

    public User selectUser(Integer id);

    public Page<User> selectUserByPage(Integer pageNum, Integer pageSize);

    public Integer insertUser(User user);

    public Integer updateUser(Integer id, Integer age);

    public Integer deleteUser(Integer id);
}
