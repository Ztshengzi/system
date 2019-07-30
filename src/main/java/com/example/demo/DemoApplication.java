package com.example.demo;

import java.util.logging.Logger;

import com.example.demo.mapper.LoginMapper;
import com.google.gson.Gson;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {
    private final LoginMapper loginMapper;

    public DemoApplication(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
