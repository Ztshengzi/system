package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login loginUser(Map<String, Object> map) {
        return loginMapper.loginUser(map);
    }
}
