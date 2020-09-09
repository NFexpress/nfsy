package com.nf.pojo;

import java.io.Serializable;

/**
 * (District)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:59
 */
public class District implements Serializable {
    private static final long serialVersionUID = -63580111771005283L;
    /**
     * 区号id
     */
    private Integer diId;
    /**
     * 区名称
     */
    private String diName;
    /**
     * 区开启状态 0未开启 1开启
     */
    private Integer diState;


    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    public String getDiName() {
        return diName;
    }

    public void setDiName(String diName) {
        this.diName = diName;
    }

    public Integer getDiState() {
        return diState;
    }

    public void setDiState(Integer diState) {
        this.diState = diState;
    }

}