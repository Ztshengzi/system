package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * @Author: ztsz
 * @Discription:
 * @Date: Created in 2019/7/30 13:32
 * @Modified by:
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    //请求成功返回码为：200
    private static final String successCode = "200";
    //返回码
    private String code;
    //返回描述
    private String msg;
    //返回数据
    private T data;



    public Response(String code, String msg){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response(T data){
        this.data = data;
    }
}
