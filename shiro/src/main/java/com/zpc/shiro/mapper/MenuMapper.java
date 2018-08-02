package com.zpc.shiro.mapper;

import com.zpc.shiro.entity.Menu;
import org.springframework.stereotype.Component;

/**
 * @author zhaopinchao
 * @date 2018-7-26 20:56
 */
@Component
public interface MenuMapper {

    /**
     * 新增菜单
     * @param menu
     */
    void addMenu(Menu menu);

}
