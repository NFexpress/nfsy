package com.nf.pojo;

import java.io.Serializable;

/**
 * (Detection)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:58
 */
public class Detection implements Serializable {
    private static final long serialVersionUID = 527022223401970156L;
    /**
     * 安检id
     */
    private String detId;
    /**
     * 包裹id
     */
    private String poId;
    /**
     * 是否包装 0未包装 1包装
     */
    private Integer haspack;
    /**
     * 是否检测 0未检测 1检测
     */
    private Integer hasdet;


    public String getDetId() {
        return detId;
    }

    public void setDetId(String detId) {
        this.detId = detId;
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public Integer getHaspack() {
        return haspack;
    }

    public void setHaspack(Integer haspack) {
        this.haspack = haspack;
    }

    public Integer getHasdet() {
        return hasdet;
    }

    public void setHasdet(Integer hasdet) {
        this.hasdet = hasdet;
    }

}