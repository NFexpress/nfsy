package com.nf.pojo;

import java.io.Serializable;

/**
 * (Vip)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:11
 */
public class Vip implements Serializable {
    private static final long serialVersionUID = -61333797780298998L;
    /**
     * vipid
     */
    private Integer vId;
    /**
     * vip名称
     */
    private String vName;


    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

}