package com.example.springbootdemo.controller;


import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//证明是controller层并且返回json

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "cs")
    public User cs() {
        //调用dao层
        User user = userMapper.selectUserByName("lzz");
        return user;
    }
    public User as() {
        User user = userMapper.selectUserByAge(12);
        return user;
    }

}
