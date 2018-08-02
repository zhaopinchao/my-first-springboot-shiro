package com.zpc.shiro.mapper;

import com.zpc.shiro.entity.Role;
import org.springframework.stereotype.Component;

/**
 * @author zhaopinchao
 * @date 2018-7-26 20:56
 */
@Component
public interface RoleMapper {

    /**
     * 新增角色
     * @param role
     */
    void addRole(Role role);

    /**
     * 修改角色信息
     * @param role
     */
    void updateRole(Role role);

    /**
     * 删除角色
     * @param role_id
     */
    void deleteRole(Integer role_id);
}
