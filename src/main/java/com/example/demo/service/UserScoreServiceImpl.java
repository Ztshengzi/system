package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserScore;
import com.example.demo.mapper.UserScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userScoreService")
public class UserScoreServiceImpl implements UserScoreService {
    @Autowired
    private UserScoreMapper userScoreMapper;

    @Override
    public List<UserScore> selectUserScore(Integer no) {

        return userScoreMapper.selectUserScore(no);
    }
}
