package com.zpc.shiro.entity;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
    /**
     * 用户id，主键
     */
    private Integer user_id;
    /**
     * 用户名
     */
    private String user_name;
    /**
     * 真实姓名
     */
    private String real_name;
    /**
     * 登录密码
     */
    private String user_password;
    /**
     * 用户手机号码
     */
    private String user_phone;
    /**
     * 备注
     */
    private String user_remark;

    private boolean remeberMe;
    /**
     * 用户状态
     */
    private String user_status;
    /**
     * 部门
     */
    private Department department;
    /**
     * 角色集合
     */
    private Set<Role> roles;
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
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", real_name='" + real_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_remark='" + user_remark + '\'' +
                ", user_status='" + user_status + '\'' +
                //", department=" + department.toString()==null?"":department.toString()+
                //", roles=" + roles.toString() +
                //", menus=" + menus.toString() +
                ", create_at='" + create_at + '\'' +
                ", update_user=" + update_user +
                ", create_user=" + create_user +
                ", update_at='" + update_at + '\'' +
                '}';
    }

    public boolean isRemeberMe() {
        return remeberMe;
    }

    public void setRemeberMe(boolean remeberMe) {
        this.remeberMe = remeberMe;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_remark() {
        return user_remark;
    }

    public void setUser_remark(String user_remark) {
        this.user_remark = user_remark;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
