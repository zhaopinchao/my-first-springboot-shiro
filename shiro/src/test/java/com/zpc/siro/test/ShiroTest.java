package com.zpc.siro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaopinchao
 * @date 2018-7-28 15:25
 * 测试shiro
 */
public class ShiroTest {

    private static Logger logger = LoggerFactory.getLogger(ShiroTest.class);

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void addUser(){
        simpleAccountRealm.addAccount("test","123456");
    }

    @Test
    public void testAuth(){
        //1.创建SecurityManager
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);
        //2、设置SecurityManager环境
        SecurityUtils.setSecurityManager(defaultSecurityManager);

        //3、获取用户输入的token信息
        UsernamePasswordToken utoken = new UsernamePasswordToken("test","123456");

        Subject subject = SecurityUtils.getSubject();
        subject.login(utoken);
        logger.info("isAuthed:{}"+subject.isAuthenticated());
        subject.logout();
        logger.info("isAuthed:{}"+subject.isAuthenticated());
    }

}
