package com.nf.pojo;

import java.io.Serializable;

/**
 * (Recipients)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:05
 */
public class Recipients implements Serializable {
    private static final long serialVersionUID = 376967162519284793L;
    /**
     * 收件人id
     */
    private String reId;
    /**
     * 收件人姓名
     */
    private String reName;
    /**
     * 收件人电话
     */
    private String rePhone;
    /**
     * 收件人地址id
     */
    private Integer reAddrId;


    public String getReId() {
        return reId;
    }

    public void setReId(String reId) {
        this.reId = reId;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }

    public String getRePhone() {
        return rePhone;
    }

    public void setRePhone(String rePhone) {
        this.rePhone = rePhone;
    }

    public Integer getReAddrId() {
        return reAddrId;
    }

    public void setReAddrId(Integer reAddrId) {
        this.reAddrId = reAddrId;
    }

}