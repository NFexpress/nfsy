package com.nf.pojo;

import java.io.Serializable;

/**
 * (AdminRole)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:53
 */
public class AdminRole implements Serializable {
    private static final long serialVersionUID = -54498491552783501L;
    /**
     * 管理员角色id
     */
    private Integer aRId;
    /**
     * 管理员id
     */
    private String aId;
    /**
     * 角色id
     */
    private Integer rId;


    public Integer getARId() {
        return aRId;
    }

    public void setARId(Integer aRId) {
        this.aRId = aRId;
    }

    public String getAId() {
        return aId;
    }

    public void setAId(String aId) {
        this.aId = aId;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

}