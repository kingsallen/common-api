package com.moseeker.vo.company.basic;

import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/21.
 */
@Data
@EqualsAndHashCode
public class ConfigSysH5StyleTplVO {


    private Integer   id;
    private String    name;
    private String    logo;
    private String    hrTpl;
    private String    wxTpl;
    private Short     priority;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHrTpl() {
        return hrTpl;
    }

    public void setHrTpl(String hrTpl) {
        this.hrTpl = hrTpl;
    }

    public String getWxTpl() {
        return wxTpl;
    }

    public void setWxTpl(String wxTpl) {
        this.wxTpl = wxTpl;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Byte getDisable() {
        return disable;
    }

    public void setDisable(Byte disable) {
        this.disable = disable;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
