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

}
