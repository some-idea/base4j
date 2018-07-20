package com.base4j.entity.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author hyj
 */
public class SysUser implements Serializable {

    /**
     * 用户编号
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     * 使用@JsonIgnore,在返回User时，忽略密码属性的信息
     */
    private String password;
    /**
     * 加密密码的盐
     */
    private String salt;
    /**
     * 账号是否锁定
     */
    private Boolean locked;
    /**
     * 拥有的角色集合
     */
    private Set<Integer> roleIds;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Set<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Set<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
