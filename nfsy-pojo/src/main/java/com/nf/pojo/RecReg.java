package com.nf.pojo;

import java.io.Serializable;

/**
 * (RecReg)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:04
 */
public class RecReg implements Serializable {
    private static final long serialVersionUID = -67869583157834428L;
    /**
     * 收件人地址id
     */
    private Integer reAddrId;
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


    public Integer getReAddrId() {
        return reAddrId;
    }

    public void setReAddrId(Integer reAddrId) {
        this.reAddrId = reAddrId;
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