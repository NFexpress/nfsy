package com.nf.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Job)实体类
 *
 * @author makejava
 * @since 2020-09-09 10:20:59
 */
public class Job implements Serializable {
    private static final long serialVersionUID = -55686417295408613L;
    /**
     * 工作编号id
     */
    private String jId;
    /**
     * 收单id
     */
    private String chId;
    /**
     * 派单id
     */
    private String deId;
    /**
     * 工作时间
     */
    private Date time;
    /**
     * 邮差id
     */
    private String poId;


    public String getJId() {
        return jId;
    }

    public void setJId(String jId) {
        this.jId = jId;
    }

    public String getChId() {
        return chId;
    }

    public void setChId(String chId) {
        this.chId = chId;
    }

    public String getDeId() {
        return deId;
    }

    public void setDeId(String deId) {
        this.deId = deId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

}