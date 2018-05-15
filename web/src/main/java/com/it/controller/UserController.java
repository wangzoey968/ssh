package com.it.controller;

import com.it.pojo.Tb_User;
import com.it.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzy on 2018/5/15.
 */
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserServiceInter userServiceImpl;

    @RequestMapping("/saveUser")
    public void saveUser(){
        Tb_User user = userServiceImpl.selectUser();
        System.out.println(user.toString());
    }

}
