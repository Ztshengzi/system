package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserScore;

public interface UserScoreService {
    public List<UserScore> selectUserScore(Integer no);
}
