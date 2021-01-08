package com.mhr.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户_登录表(UserLoginEntity)实体类
 *
 * @author MaHaiRui
 * @since 2020-06-12 18:39:37
 */
public class UserLoginEntity implements Serializable {
    private static final long serialVersionUID = -88062192001282739L;
    /**
    * user表主键(uuid)
    */
    private String userLoginId;
    /**
    * 关联用户信息表的id
    */
    private String userId;
    /**
    * 登录用户名
    */
    private String userLoginName;
    /**
    * 登录密码
    */
    private String userLoginPassword;
    /**
    * 用户角色：0游客，1普通用户2机构用户，3后台管理员，4超级管理员
    */
    private Object userRole;
    /**
    * 是否禁用状态:0否1是
    */
    private Object userStatusDisable;
    /**
    * 是否删除状态:0否1是
    */
    private Object userStatusDel;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;


    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    public Object getUserRole() {
        return userRole;
    }

    public void setUserRole(Object userRole) {
        this.userRole = userRole;
    }

    public Object getUserStatusDisable() {
        return userStatusDisable;
    }

    public void setUserStatusDisable(Object userStatusDisable) {
        this.userStatusDisable = userStatusDisable;
    }

    public Object getUserStatusDel() {
        return userStatusDel;
    }

    public void setUserStatusDel(Object userStatusDel) {
        this.userStatusDel = userStatusDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}