package com.nf.pojo;

import java.io.Serializable;

/**
 * (UserPermission)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:09
 */
public class UserPermission implements Serializable {
    private static final long serialVersionUID = 512744832474296541L;
    /**
     * 用户权限id
     */
    private Integer uPeId;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 权限id
     */
    private Integer peId;


    public Integer getUPeId() {
        return uPeId;
    }

    public void setUPeId(Integer uPeId) {
        this.uPeId = uPeId;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public Integer getPeId() {
        return peId;
    }

    public void setPeId(Integer peId) {
        this.peId = peId;
    }

}