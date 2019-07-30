package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.UserScore;
import org.springframework.stereotype.Repository;

@Repository
public interface UserScoreMapper {
    List<UserScore> selectUserScore(Integer no);
}
