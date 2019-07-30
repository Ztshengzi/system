package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.exception.ErrorCodeAndMsg;
import com.example.demo.exception.UserException;
import com.example.demo.entity.Response;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserControl {

    @Autowired
    private UserService userService;

    //该方法可以使用Post
    @PostMapping(value = "/selectAllUser")
    public List<User> SelectAllUser() {
        return userService.selectAllUser();
    }

    //@RequestMapping(value = "/selectUser")
    //public String SelectUser(HttpServletRequest request) {
    //    Integer id = Integer.valueOf(request.getParameter("id"));
    //    return userService.selectUser(id).toString();
    //}

    @PostMapping(value = "/selectUser")
    public User SelectUser(@RequestBody User user){
        return userService.selectUser(user.getId());
    }


    //实现分页
    @PostMapping(value = "/pageList")
    public PageInfo<User> selectUserByPage(@RequestBody JSONObject json){
        int pageNum = Integer.valueOf(json.getString("pageNum"));
        int pageSize = Integer.valueOf(json.getString("pageSize"));
        Page<User> user = userService.selectUserByPage(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(user);
        return pageInfo;
    }



    ////该方法不能使用Post
    //@RequestMapping(value = "/insertUser")
    //public Integer InsertUser(HttpServletRequest request) {
    //    Integer id = Integer.valueOf(request.getParameter("id"));
    //    String name = request.getParameter("name");
    //    String sex = request.getParameter("sex");
    //    Integer age = Integer.valueOf(request.getParameter("age"));
    //    return userService.insertUser(user);
    //}

    //该方法可以使用Post
    @PostMapping(value = "/insertUser")
    public String InsertUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        else{
            return "插入学生信息成功，"+userService.insertUser(user);
        }
    }

    //@RequestMapping(value = "/updateUser")
    //public Integer UpdateUser(HttpServletRequest request) {
    //    Integer id = Integer.valueOf(request.getParameter("id"));
    //    Integer age = Integer.valueOf(request.getParameter("age"));
    //    return userService.updateUser(id, age);
    //}

    @PostMapping(value = "/updateUser")
    public Integer UpdateUser(@RequestBody User user){
        return userService.updateUser(user.getId(), user.getAge());
    }


    @PostMapping(value = "/insertUserPage")
    public List<User> InsertUserPage(@RequestBody User user){
        userService.insertUser(user);
        return userService.selectAllUser();
    }

    @PostMapping(value = "/updateUserPage")
    public List<User> UpdateUserPage(@RequestBody User user){
        userService.updateUser(user.getId(),user.getAge());
        return userService.selectAllUser();
    }

    @PostMapping(value = "/deleteUser")
    public Integer DeleteUser(@RequestBody User user) {
        return userService.deleteUser(user.getId());
    }

    @PostMapping(value = "/deleteUserPage")
    public List<User> DeleteUserPage(@RequestBody User user){
        userService.deleteUser(user.getId());
        return userService.selectAllUser();
    }

    @PostMapping(value = "/insertTest")
    public Response InsertTest(@RequestBody  User user){
        try{
            log.info("Insert student information:{}",user.getNo(),user.getName(),user.getSex(),user.getAge());
            if(user.getNo() == null){
                throw new UserException(ErrorCodeAndMsg.User_no_not_null);
            }
            if(user.getName().isEmpty()){
                throw new UserException(ErrorCodeAndMsg.User_name_not_empty);
            }
            if(user.getAge()>100){
                throw new UserException(ErrorCodeAndMsg.User_age_max);
            }
            return new Response(user);
        }
        catch (Exception e){
            throw e;
        }
    }
}
