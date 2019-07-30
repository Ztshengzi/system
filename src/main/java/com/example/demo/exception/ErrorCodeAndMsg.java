package com.example.demo.exception;


/**
 * @Author: ztsz
 * @Discription:
 * @Date: Created in 2019/7/30 13:37
 * @Modified by:
 */

public enum ErrorCodeAndMsg {
    User_no_not_null("101","学号不能为Null!"),
    User_name_not_empty("102","姓名不能为空!"),
    User_age_max("103","年龄不能超过100!"),
    ;

    private String code;
    private String msg;

    ErrorCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }


}
