package com.nf.pojo;

import java.io.Serializable;

/**
 * (MailType)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:00
 */
public class MailType implements Serializable {
    private static final long serialVersionUID = 924940819942767040L;
    /**
     * 寄件类型id
     */
    private Integer maTId;
    /**
     * 寄件类型名称
     */
    private String maTName;
    /**
     * 寄件类型描述
     */
    private String maTInfo;


    public Integer getMaTId() {
        return maTId;
    }

    public void setMaTId(Integer maTId) {
        this.maTId = maTId;
    }

    public String getMaTName() {
        return maTName;
    }

    public void setMaTName(String maTName) {
        this.maTName = maTName;
    }

    public String getMaTInfo() {
        return maTInfo;
    }

    public void setMaTInfo(String maTInfo) {
        this.maTInfo = maTInfo;
    }

}