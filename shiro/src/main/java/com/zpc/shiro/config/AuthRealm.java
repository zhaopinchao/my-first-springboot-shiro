package com.zpc.shiro.config;

import com.zpc.shiro.entity.Menu;
import com.zpc.shiro.entity.Role;
import com.zpc.shiro.entity.User;
import com.zpc.shiro.mapper.FuncMapper;
import com.zpc.shiro.mapper.UserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhaopinchao
 * @date 2018-7-28 08:04
 */
public class AuthRealm extends AuthorizingRealm {

    private static Logger logger = LoggerFactory.getLogger(AuthRealm.class);

    @Autowired
    private FuncMapper funcMapper;

    @Autowired
    private UserMapper userMapper;

    {super.setName("authRealm");}

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取session中的用户
        String user_name=(String) principals.fromRealm(this.getClass().getName()).iterator().next();
        //通过用户名来查询用户所具有的所有操作权限
        Set<String> permissions = new HashSet<>();
        permissions = funcMapper.getFuncByUserName(user_name);
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //将权限放入shiro中.
        info.addStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //从主体传过来的认证信息中，获得用户名
        String username = (String) token.getPrincipal();
        //通过用户名得到数据库中的凭证
        User user = userMapper.getUserByName(username);
        String password = null;
        if(user == null){
            return null;
        }
        password = user.getUser_password();
        if (StringUtils.isEmpty(password)){
            return null;
        }
        //放入shiro.调用CredentialsMatcher检验密码
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUser_name(),password,this.getClass().getName());
        return authenticationInfo;
    }
}
