package com.zpc.shiro.entity;

import java.io.Serializable;

public class Department implements Serializable {
    /**
     * 部门id，主键
     */
    private Integer department_id;
    /**
     * 部门名称
     */
    private String department_name;
    /**
     * 部门级别
     */
    private Integer department_rank;
    /**
     * 父级部门id
     */
    private Integer parent_id;
    /**
     * 创建时间
     */
    private String create_at;
    /**
     * 创建者id
     */
    private Integer create_user;
    /**
     * 修改者id
     */
    private Integer update_user;
    /**
     * 修改时间
     */
    private String update_at;

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", department_rank=" + department_rank +
                ", parent_id=" + parent_id +
                ", create_at='" + create_at + '\'' +
                ", create_user=" + create_user +
                ", update_user=" + update_user +
                ", update_at='" + update_at + '\'' +
                '}';
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Integer getDepartment_rank() {
        return department_rank;
    }

    public void setDepartment_rank(Integer department_rank) {
        this.department_rank = department_rank;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public Integer getCreate_user() {
        return create_user;
    }

    public void setCreate_user(Integer create_user) {
        this.create_user = create_user;
    }

    public Integer getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(Integer update_user) {
        this.update_user = update_user;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }
}
