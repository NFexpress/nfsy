package com.nf.pojo;

import java.io.Serializable;

/**
 * (Package)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:01
 */
public class Package implements Serializable {
    private static final long serialVersionUID = -47507857504891152L;
    /**
     * 包裹id
     */
    private String paId;
    /**
     * 包裹单
     */
    private String paName;
    /**
     * 包裹状态
     */
    private Integer paState;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 类型id
     */
    private String tId;


    public String getPaId() {
        return paId;
    }

    public void setPaId(String paId) {
        this.paId = paId;
    }

    public String getPaName() {
        return paName;
    }

    public void setPaName(String paName) {
        this.paName = paName;
    }

    public Integer getPaState() {
        return paState;
    }

    public void setPaState(Integer paState) {
        this.paState = paState;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getTId() {
        return tId;
    }

    public void setTId(String tId) {
        this.tId = tId;
    }

}