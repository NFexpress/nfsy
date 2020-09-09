package com.nf.pojo;

import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:02
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 265422603354850520L;
    /**
     * 权限id
     */
    private Integer peId;
    /**
     * 权限名称
     */
    private String peName;
    /**
     * 权限描述
     */
    private String peInfo;


    public Integer getPeId() {
        return peId;
    }

    public void setPeId(Integer peId) {
        this.peId = peId;
    }

    public String getPeName() {
        return peName;
    }

    public void setPeName(String peName) {
        this.peName = peName;
    }

    public String getPeInfo() {
        return peInfo;
    }

    public void setPeInfo(String peInfo) {
        this.peInfo = peInfo;
    }

}