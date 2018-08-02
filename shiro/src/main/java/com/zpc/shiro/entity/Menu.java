package com.zpc.shiro.entity;

import java.io.Serializable;
import java.util.Set;

public class Menu implements Serializable {

    /**
     *
     */
    private Integer menu_id;
    /**
     *
     */
    private String menu_name;
    /**
     *
     */
    private String menu_url;
    /**
     *
     */
    private Integer parent_id;

    /**
     *
     */
    private Set<Func> funcs;
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
        return "Menu{" +
                "menu_id=" + menu_id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", parent_id=" + parent_id +
                ", funcs=" + funcs.toString() +
                ", create_at='" + create_at + '\'' +
                ", update_user=" + update_user +
                ", create_user=" + create_user +
                ", update_at='" + update_at + '\'' +
                '}';
    }

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Set<Func> getFuncs() {
        return funcs;
    }

    public void setFuncs(Set<Func> funcs) {
        this.funcs = funcs;
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
