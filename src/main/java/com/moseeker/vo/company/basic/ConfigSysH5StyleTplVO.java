package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/21.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "大岂H5模板")
public class ConfigSysH5StyleTplVO {


    private Integer   id;
    @ApiModelProperty(value = "模板名称")
    private String    name;
    @ApiModelProperty(value = "模板LOGO的相对路径")
    private String    logo;
    @ApiModelProperty(value = "模板风格名称，只允许英文，hr预览用")
    private String    hrTpl;
    @ApiModelProperty(value = "模板风格名称，只允许英文，微信端用")
    private String    wxTpl;
    @ApiModelProperty(value = "排序优先级")
    private Short     priority;
    @ApiModelProperty(value = "是否有效  0：有效 1：无效")
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
