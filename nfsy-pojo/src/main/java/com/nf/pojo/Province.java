package com.nf.pojo;

import java.io.Serializable;

/**
 * (Province)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:03
 */
public class Province implements Serializable {
    private static final long serialVersionUID = 355920774339722388L;
    /**
     * 省号id
     */
    private Integer prId;
    /**
     * 省名称
     */
    private String prName;
    /**
     * 省开启状态 0未开启 1开启
     */
    private Integer prState;


    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public Integer getPrState() {
        return prState;
    }

    public void setPrState(Integer prState) {
        this.prState = prState;
    }

}