package com.nf.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:08
 */
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = -68506015969858159L;
    /**
     * 用户id
     */
    @Column(name = "u_id")
    private String uId;
    /**
     * 用户名
     */
    @Column(name = "u_name")
    private String uName;
    /**
     * 用户年龄
     */
    @Column(name = "u_age")
    private Integer uAge;
    /**
     * 用户性别
     */
    @Column(name = "u_sex")
    private String uSex;
    /**
     * 用户联系方式
     */
    @Column(name = "u_phone")
    private String uPhone;
    /**
     * 用户详细地址
     */
    @Column(name = "u_addr")
    private String uAddr;
    /**
     * 用户邮箱
     */
    @Column(name = "u_email")
    private String uEmail;
    /**
     * 用户二维码
     */
    @Column(name = "u_code")
    private String uCode;
    /**
     * 用户积分
     */
    @Column(name = "u_integral")
    private Integer uIntegral;
    /**
     * 会员id
     */
    @Column(name = "v_id")
    private Integer vId;
    /**
     * 省id
     */
    @Column(name = "pr_id")
    private Integer prId;
    /**
     * 市id
     */
    @Column(name = "c_id")
    private Integer cId;
    /**
     * 区id
     */
    @Column(name = "di_id")
    private Integer diId;


    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public Integer getUAge() {
        return uAge;
    }

    public void setUAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getUSex() {
        return uSex;
    }

    public void setUSex(String uSex) {
        this.uSex = uSex;
    }

    public String getUPhone() {
        return uPhone;
    }

    public void setUPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getUAddr() {
        return uAddr;
    }

    public void setUAddr(String uAddr) {
        this.uAddr = uAddr;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUCode() {
        return uCode;
    }

    public void setUCode(String uCode) {
        this.uCode = uCode;
    }

    public Integer getUIntegral() {
        return uIntegral;
    }

    public void setUIntegral(Integer uIntegral) {
        this.uIntegral = uIntegral;
    }

    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

}