package com.example.demo;

import com.example.demo.controller.UserControl;
import com.example.demo.entity.User;
import com.example.demo.entity.Response;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: ztsz
 * @Discription:
 * @Date: Created in 2019/7/30 14:49
 * @Modified by:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private UserService userService;

    @Autowired
    private UserControl userControl;

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;


    @Test
    public void insert(){
        User user = new User();
        user.setId(3);
        user.setNo(1003);
        user.setName("宣萱");
        user.setSex("女");
        user.setAge(15);
        userService.insertUser(user);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId(1);
        user.setAge(100);
        userService.updateUser(user.getId(),user.getAge());
    }

}
