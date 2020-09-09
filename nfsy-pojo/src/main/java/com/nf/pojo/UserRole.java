package com.nf.pojo;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:10
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = -54698536181386343L;
    /**
     * 用户角色id
     */
    private Integer uRId;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 角色id
     */
    private Integer rId;


    public Integer getURId() {
        return uRId;
    }

    public void setURId(Integer uRId) {
        this.uRId = uRId;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

}