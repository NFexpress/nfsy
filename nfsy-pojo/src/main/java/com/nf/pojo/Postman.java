package com.nf.pojo;

import java.io.Serializable;

/**
 * (Postman)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:21:03
 */
public class Postman implements Serializable {
    private static final long serialVersionUID = -74864939788614175L;
    /**
     * 邮差id
     */
    private String poId;
    /**
     * 邮差姓名
     */
    private String poName;
    /**
     * 邮差电话
     */
    private String poPhone;
    /**
     * 邮差密码
     */
    private String poPass;
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


    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public String getPoPhone() {
        return poPhone;
    }

    public void setPoPhone(String poPhone) {
        this.poPhone = poPhone;
    }

    public String getPoPass() {
        return poPass;
    }

    public void setPoPass(String poPass) {
        this.poPass = poPass;
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

}