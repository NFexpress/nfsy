package com.nf.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Delivery)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:57
 */
public class Delivery implements Serializable {
    private static final long serialVersionUID = 176621200410458621L;
    /**
     * 派单id
     */
    private String deId;
    /**
     * 邮差id
     */
    private String poId;
    /**
     * 包裹id
     */
    private String paId;
    /**
     * 派单时间
     */
    private Date time;


    public String getDeId() {
        return deId;
    }

    public void setDeId(String deId) {
        this.deId = deId;
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public String getPaId() {
        return paId;
    }

    public void setPaId(String paId) {
        this.paId = paId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}