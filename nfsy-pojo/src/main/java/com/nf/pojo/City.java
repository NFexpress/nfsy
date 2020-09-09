package com.nf.pojo;

import java.io.Serializable;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:56
 */
public class City implements Serializable {
    private static final long serialVersionUID = 269578914482907818L;
    /**
     * 市号id
     */
    private Integer cId;
    /**
     * 市名称
     */
    private String cName;
    /**
     * 市开启状态 0未开启 1开启
     */
    private Integer cState;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public Integer getCState() {
        return cState;
    }

    public void setCState(Integer cState) {
        this.cState = cState;
    }

}