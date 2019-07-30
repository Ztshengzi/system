package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import com.example.demo.vo.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@RestController
public class LoginControl {

    @Autowired
    private LoginService loginService;

    //该方法可以使用Post
    @PostMapping(value = "/loginUser")
    @ResponseBody
    public Object LoginUser(HttpServletRequest request,@RequestBody Login login) {
        Map<String,Object> map = new HashMap<>();
        map.put("administrator",login.getAdministrator());
        map.put("password",login.getPassword());
        login = loginService.loginUser(map);
        if(login == null){
            return new ResultBean(-1,"用户名密码错误",null);
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("login",login);
        }
        return new ResultBean(200,"登陆成功",login);
    }

    @PostMapping("/")
    public Object index() {
        return "loginUser";
    }
    @RequestMapping("/index")
    public String indexHtml() {
        return "/login";
    }

}
