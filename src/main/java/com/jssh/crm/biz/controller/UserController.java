package com.jssh.crm.biz.controller;

import com.jssh.crm.biz.model.User;
import com.jssh.crm.biz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by S on 2018/4/18
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("user/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") int id){
        return userService.queryUserById(id);
    }
}
