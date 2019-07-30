package com.example.demo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {
    private Integer id;
    @NotNull(message = "学号不能为Null！")
    private Integer no;
    @NotEmpty(message = "姓名不能为空！")
    private String name;
    @Max(value = 100, message = "年龄过大，注意安全！")
    private Integer age;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", no='" + no + '\'' +
            ", name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", sex='" + sex + '\'' +
            '}';
    }
}
