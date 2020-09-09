package com.nf.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Charge)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:55
 */
public class Charge implements Serializable {
    private static final long serialVersionUID = -38855205838324282L;
    /**
     * 收单id
     */
    private String chId;
    /**
     * 包裹id
     */
    private String paId;
    /**
     * 邮差id
     */
    private String poId;
    /**
     * 收单时间
     */
    private Date time;


    public String getChId() {
        return chId;
    }

    public void setChId(String chId) {
        this.chId = chId;
    }

    public String getPaId() {
        return paId;
    }

    public void setPaId(String paId) {
        this.paId = paId;
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}