package com.zpc.shiro.entity;

import java.util.Set;

public class Role {
    /**
     * 角色id，主键
     */
    private Integer role_id;
    /**
     * 角色名称
     */
    private String role_name;
    /**
     * 角色级别
     */
    private Integer role_rank;

    /**
     * 菜单集合
     */
    private Set<Menu> menus;

    /**
     * 创建时间
     */
    private String create_at;
    /**
     * 修改者id
     */
    private Integer update_user;
    /**
     * 创建者id
     */
    private Integer create_user;
    /**
     * 修改时间
     */
    private String update_at;

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                ", role_rank=" + role_rank +
                ", menus=" + menus.toString() +
                ", create_at='" + create_at + '\'' +
                ", update_user=" + update_user +
                ", create_user=" + create_user +
                ", update_at='" + update_at + '\'' +
                '}';
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Integer getRole_rank() {
        return role_rank;
    }

    public void setRole_rank(Integer role_rank) {
        this.role_rank = role_rank;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public Integer getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(Integer update_user) {
        this.update_user = update_user;
    }

    public Integer getCreate_user() {
        return create_user;
    }

    public void setCreate_user(Integer create_user) {
        this.create_user = create_user;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
