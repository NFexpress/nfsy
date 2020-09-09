package com.nf.pojo;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:06
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -80858129795976675L;
    /**
     * 角色id
     */
    private Integer rId;
    /**
     * 角色名称
     */
    private String rName;
    /**
     * 角色描述
     */
    private String rInfo;


    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public String getRInfo() {
        return rInfo;
    }

    public void setRInfo(String rInfo) {
        this.rInfo = rInfo;
    }

}