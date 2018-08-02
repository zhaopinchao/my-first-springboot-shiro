package com.zpc.shiro.controller;

import com.zpc.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * @author zhaopinchao
 * @date 2018-7-28 09:23
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("")
    public String login(User user){
        logger.info("用户登录参数：{}",user.toString());
        String username = user.getUser_name();
        String password = user.getUser_password();
        if(StringUtils.isEmpty(username)){
            return "用户名不能为空";
        }
        if(StringUtils.isEmpty(password)){
            return "密码不能为空";
        }

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken utoken = new UsernamePasswordToken(user.getUser_name(),user.getUser_password());
        String message = null;
        try {
            utoken.setRememberMe(user.isRemeberMe());
            subject.login(utoken);
            logger.info("用户登录成功");
            message = "用户登录成功";
        } catch (AuthenticationException e) {
            logger.info("用户登录失败");
            message = "用户登录失败";
            e.printStackTrace();
        }
        try {
            subject.checkPermissions("user:create");
            message += ",用户拥有创建用户的权限";
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("未拥有的权限信息：{}",e.getMessage());
            message += ",用户未拥有创建用户的权限";
        }
        return message;
    }

    @GetMapping("")
    public String checkPermission(){
        Subject subject = SecurityUtils.getSubject();
        try {
            //检查是否具有创建用户的权利
            subject.checkPermissions("user:create");
            return "有权限";
        } catch (AuthorizationException e) {
            e.printStackTrace();
            return "无权限";
        }
    }

}