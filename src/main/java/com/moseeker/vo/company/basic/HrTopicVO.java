/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 雇主主题活动表
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTopicVO {

    private static final long serialVersionUID = 1713160320;

    private Integer   id;
    private Integer   companyId;
    private String    shareTitle;
    private String    shareLogo;
    private String    shareDescription;
    private Integer   styleId;
    private Integer   creator;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareLogo() {
        return shareLogo;
    }

    public void setShareLogo(String shareLogo) {
        this.shareLogo = shareLogo;
    }

    public String getShareDescription() {
        return shareDescription;
    }

    public void setShareDescription(String shareDescription) {
        this.shareDescription = shareDescription;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
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
