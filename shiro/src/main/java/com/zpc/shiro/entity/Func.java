package com.zpc.shiro.entity;

import java.io.Serializable;

public class Func implements Serializable {
    private Integer func_id;
    private String func_name;
    private String func_code;
    private String func_url;
    private Integer parent_id;

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
        return "Func{" +
                "func_id=" + func_id +
                ", func_name='" + func_name + '\'' +
                ", func_code='" + func_code + '\'' +
                ", func_url='" + func_url + '\'' +
                ", parent_id=" + parent_id +
                ", create_at='" + create_at + '\'' +
                ", update_user=" + update_user +
                ", create_user=" + create_user +
                ", update_at='" + update_at + '\'' +
                '}';
    }

    public Integer getFunc_id() {
        return func_id;
    }

    public void setFunc_id(Integer func_id) {
        this.func_id = func_id;
    }

    public String getFunc_name() {
        return func_name;
    }

    public void setFunc_name(String func_name) {
        this.func_name = func_name;
    }

    public String getFunc_code() {
        return func_code;
    }

    public void setFunc_code(String func_code) {
        this.func_code = func_code;
    }

    public String getFunc_url() {
        return func_url;
    }

    public void setFunc_url(String func_url) {
        this.func_url = func_url;
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
