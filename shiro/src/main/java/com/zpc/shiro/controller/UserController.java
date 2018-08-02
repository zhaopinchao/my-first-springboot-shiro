package com.zpc.shiro.controller;

import com.zpc.shiro.mapper.UserMapper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaopinchao
 * @date 2018-7-28 21:41
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequiresPermissions("user:create")
    @PostMapping("")
    public String addUser(){
        return "addUser";
    }

    @RequiresPermissions("user:update")
    @PutMapping("")
    public String updateUser(){
        return "updateUser";
    }
}
