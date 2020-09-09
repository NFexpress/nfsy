package com.nf.pojo;

import java.io.Serializable;

/**
 * (PackageType)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:01
 */
public class PackageType implements Serializable {
    private static final long serialVersionUID = 723001566593968591L;
    /**
     * 包裹类型id
     */
    private Integer paTId;
    /**
     * 包裹类型名称
     */
    private String paTName;
    /**
     * 包裹类型描述
     */
    private String paTInfo;


    public Integer getPaTId() {
        return paTId;
    }

    public void setPaTId(Integer paTId) {
        this.paTId = paTId;
    }

    public String getPaTName() {
        return paTName;
    }

    public void setPaTName(String paTName) {
        this.paTName = paTName;
    }

    public String getPaTInfo() {
        return paTInfo;
    }

    public void setPaTInfo(String paTInfo) {
        this.paTInfo = paTInfo;
    }

}