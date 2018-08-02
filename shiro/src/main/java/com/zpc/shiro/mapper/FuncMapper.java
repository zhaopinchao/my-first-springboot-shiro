package com.zpc.shiro.mapper;

import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author zhaopinchao
 * @date 2018-7-26 20:56
 */
@Component
public interface FuncMapper {

    /**
     * 查询单个用户有哪些权限
     * @param user_name
     * @return
     */
    Set<String> getFuncByUserName(String user_name);
}
