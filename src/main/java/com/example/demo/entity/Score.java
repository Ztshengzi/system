package com.example.demo.entity;

public class Score {
    private Integer id;
    private Integer user_id;
    private String subject;
    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
            "id=" + id +
            ", user_id='" + user_id + '\'' +
            ", subject='" + subject + '\'' +
            ", score='" + score + '\'' +
            '}';
    }
}
