package com.nf.pojo;

import java.io.Serializable;

/**
 * (SenReg)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:07
 */
public class SenReg implements Serializable {
    private static final long serialVersionUID = -33450964159171119L;
    /**
     * 寄件人地址id
     */
    private Integer sAddrId;
    /**
     * 省号id
     */
    private Integer prId;
    /**
     * 市号id
     */
    private Integer cId;
    /**
     * 区号id
     */
    private Integer diId;
    /**
     * 详细地址
     */
    private String detailAddr;


    public Integer getSAddrId() {
        return sAddrId;
    }

    public void setSAddrId(Integer sAddrId) {
        this.sAddrId = sAddrId;
    }

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getDiId() {
        return diId;
    }

    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

}