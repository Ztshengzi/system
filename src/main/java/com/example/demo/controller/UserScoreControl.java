package com.example.demo.controller;

import com.example.demo.entity.UserScore;
import com.example.demo.service.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserScoreControl {
    @Autowired
    private UserScoreService userScoreService;

    //该方法可以使用Post
    @PostMapping(value = "/selectUserScore")
    public String SelectUserScore(@RequestBody UserScore userScore) {
        return userScoreService.selectUserScore(userScore.getNo()).toString();
    }
}
