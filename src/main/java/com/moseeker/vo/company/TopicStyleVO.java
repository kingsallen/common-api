package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicStyleVO {
    private int id;
    private String name;
    private String hrTpl;
    private String wxTpl;
    private String logo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
