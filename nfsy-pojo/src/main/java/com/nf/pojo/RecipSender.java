package com.nf.pojo;

import java.io.Serializable;

/**
 * (RecipSender)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:05
 */
public class RecipSender implements Serializable {
    private static final long serialVersionUID = -68531779180931156L;
    /**
     * 收件人寄件人关系id
     */
    private Integer reSId;
    /**
     * 收件人id
     */
    private String reId;
    /**
     * 寄件人id
     */
    private String sId;


    public Integer getReSId() {
        return reSId;
    }

    public void setReSId(Integer reSId) {
        this.reSId = reSId;
    }

    public String getReId() {
        return reId;
    }

    public void setReId(String reId) {
        this.reId = reId;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

}