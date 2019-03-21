package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/9/26.
 */
@Data
@ApiModel(value = "招聘进度数据模型")
public class ConfigSysPointsConfTplVO {
    @ApiModelProperty(value = "",required = false)
    private Integer id;
    @ApiModelProperty(value = "申请状态",required = false)
    private String  status;
    @ApiModelProperty(value = "奖励积分",required = false)
    private Integer award;
    @ApiModelProperty(value = "描述",required = false)
    private String  description;
    @ApiModelProperty(value = "是否可用",required = false)
    private Integer disable;
    @ApiModelProperty(value = "排序",required = false)
    private Integer priority;
    @ApiModelProperty(value = "多套模板",required = false)
    private Integer typeId;
    @ApiModelProperty(value = "inteview tag",required = false)
    private Byte    tag;
    @ApiModelProperty(value = "推荐积分初始化0:需要 1:不需要",required = false)
    private Byte    isInitAward;
    @ApiModelProperty(value = "招聘进度顺序",required = false)
    private Integer recruitOrder;
    @ApiModelProperty(value = "求职者的文案",required = false)
    private String  applierView;

}

