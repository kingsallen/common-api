package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MergeAccountVO {
    private Integer currId;
    private Integer logout;
    private Integer needMerge;
    private Integer wxCompanyId;
    private String wxCompanyName;
    private Integer mbCompanyId;
    private String mbCompanyName;

    public Integer getCurrId() {
        return currId;
    }

    public void setCurrId(Integer currId) {
        this.currId = currId;
    }

    public Integer getLogout() {
        return logout;
    }

    public void setLogout(Integer logout) {
        this.logout = logout;
    }

    public Integer getNeedMerge() {
        return needMerge;
    }

    public void setNeedMerge(Integer needMerge) {
        this.needMerge = needMerge;
    }

    public Integer getWxCompanyId() {
        return wxCompanyId;
    }

    public void setWxCompanyId(Integer wxCompanyId) {
        this.wxCompanyId = wxCompanyId;
    }

    public String getWxCompanyName() {
        return wxCompanyName;
    }

    public void setWxCompanyName(String wxCompanyName) {
        this.wxCompanyName = wxCompanyName;
    }

    public Integer getMbCompanyId() {
        return mbCompanyId;
    }

    public void setMbCompanyId(Integer mbCompanyId) {
        this.mbCompanyId = mbCompanyId;
    }

    public String getMbCompanyName() {
        return mbCompanyName;
    }

    public void setMbCompanyName(String mbCompanyName) {
        this.mbCompanyName = mbCompanyName;
    }
}
