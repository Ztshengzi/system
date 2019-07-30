package com.example.demo.exception;

/**
 * @Author: ztsz
 * @Discription:
 * @Date: Created in 2019/7/30 13:44
 * @Modified by:
 */

public class UserException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private final ErrorCodeAndMsg response;

    public UserException(ErrorCodeAndMsg response) {
        this.response = response;
    }
    public ErrorCodeAndMsg getResponse() {
        return response;
    }

}
