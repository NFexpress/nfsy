package com.nf.pojo;

import java.io.Serializable;

/**
 * (Price)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:03
 */
public class Price implements Serializable {
    private static final long serialVersionUID = -19763992658864548L;
    /**
     * 价格id
     */
    private Integer pId;
    /**
     * 包裹类型id
     */
    private Integer paTId;
    /**
     * 寄件类型id
     */
    private Integer maTId;
    /**
     * 详细价格
     */
    private Double pPrice;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPaTId() {
        return paTId;
    }

    public void setPaTId(Integer paTId) {
        this.paTId = paTId;
    }

    public Integer getMaTId() {
        return maTId;
    }

    public void setMaTId(Integer maTId) {
        this.maTId = maTId;
    }

    public Double getPPrice() {
        return pPrice;
    }

    public void setPPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

}