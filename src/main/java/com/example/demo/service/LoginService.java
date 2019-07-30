package com.example.demo.service;

import com.example.demo.entity.Login;

import java.util.Map;

public interface LoginService {
    public Login loginUser(Map<String, Object> map);
}
