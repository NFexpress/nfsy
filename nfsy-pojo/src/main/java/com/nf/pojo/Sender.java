package com.nf.pojo;

import java.io.Serializable;

/**
 * (Sender)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:07
 */
public class Sender implements Serializable {
    private static final long serialVersionUID = -20534825032909043L;
    /**
     * 寄件人id
     */
    private String sId;
    /**
     * 寄件人姓名
     */
    private String sName;
    /**
     * 寄件人电话
     */
    private String sPhone;
    /**
     * 寄件人地址id
     */
    private Integer sAddrId;


    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public Integer getSAddrId() {
        return sAddrId;
    }

    public void setSAddrId(Integer sAddrId) {
        this.sAddrId = sAddrId;
    }

}