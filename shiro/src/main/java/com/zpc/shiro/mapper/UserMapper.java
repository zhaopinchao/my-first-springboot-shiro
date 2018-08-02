package com.zpc.shiro.mapper;

import com.zpc.shiro.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zhaopinchao
 * @date 2018-7-26 20:56
 */
@Component
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 修改用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param user_id
     */
    void deleteUser(Integer user_id);

    /**
     * 查询单个用户
     * @param user_id
     * @return
     */
    User getUser(Integer user_id);

    /**
     * 通过用户名来查找用户
     * @param user_name
     * @return
     */
    User getUserByName(String user_name);
    /**
     * 分页查询用户
     * @return
     */
    List<User> pagingUser(Map<String,Object> param);

    /**
     * 获取分页用户的总数量
     * @param param
     * @return
     */
    Integer countPagingUser(Map<String,Object> param);

    /**
     * 添加用户时，对关键字段进行查重
     * @param user
     * @return
     */
    Integer checkRepeat(User user);
}
