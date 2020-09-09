package com.nf.pojo;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:11:19
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -84618569431853888L;
    /**
     * 管理员id
     */
    private String aId;
    /**
     * 管理员名称
     */
    private String aName;
    /**
     * 管理员密码
     */
    private String aPass;
    /**
     * 管理员电话
     */
    private String aPhone;
    /**
     * 管理员邮箱
     */
    private String aEmail;


    public String getAId() {
        return aId;
    }

    public void setAId(String aId) {
        this.aId = aId;
    }

    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    public String getAPass() {
        return aPass;
    }

    public void setAPass(String aPass) {
        this.aPass = aPass;
    }

    public String getAPhone() {
        return aPhone;
    }

    public void setAPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    public String getAEmail() {
        return aEmail;
    }

    public void setAEmail(String aEmail) {
        this.aEmail = aEmail;
    }

}