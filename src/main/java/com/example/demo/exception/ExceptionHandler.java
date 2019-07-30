package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.entity.Response;

/**
 * @Author: ztsz
 * @Discription:
 * @Date: Created in 2019/7/30 13:46
 * @Modified by:
 */

@ControllerAdvice
@Slf4j
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(UserException.class)
    @ResponseBody
    public Response handleUserException(HttpServletRequest request, UserException ex) {
        Response response;
        log.error("UserException code:{},msg:{}",ex.getResponse().getCode(),ex.getResponse().getMsg());
        response = new Response(ex.getResponse().getCode(),ex.getResponse().getMsg());
        return response;
    }
}
