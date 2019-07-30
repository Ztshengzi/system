package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    List<User> selectAllUser();

    User selectUser(Integer id);

    Page<User> selectUserByPage();

    Integer insertUser(User user);

    Integer updateUser(@Param("id") Integer id, @Param("age") Integer age);

    Integer deleteUser(Integer id);
}
