package com.moseeker.vo.company.basic;

import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CampaignPcBannerVO {
    private Integer   id;
    private String    href;
    private String    imgUrl;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
