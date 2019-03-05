package com.zhangxy.sharding.entity;

import java.io.Serializable;

/**
 * @author zhangxy
 * @date 2019/03/05
 **/
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer roleId;

    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
