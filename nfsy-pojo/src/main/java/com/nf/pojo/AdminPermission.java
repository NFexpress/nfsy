package com.nf.pojo;

import java.io.Serializable;

/**
 * (AdminPermission)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:49
 */
public class AdminPermission implements Serializable {
    private static final long serialVersionUID = 651720981751045332L;
    /**
     * 管理员权限id
     */
    private Integer aPeId;
    /**
     * 管理员id
     */
    private String aId;
    /**
     * 权限id
     */
    private Integer peId;


    public Integer getAPeId() {
        return aPeId;
    }

    public void setAPeId(Integer aPeId) {
        this.aPeId = aPeId;
    }

    public String getAId() {
        return aId;
    }

    public void setAId(String aId) {
        this.aId = aId;
    }

    public Integer getPeId() {
        return peId;
    }

    public void setPeId(Integer peId) {
        this.peId = peId;
    }

}