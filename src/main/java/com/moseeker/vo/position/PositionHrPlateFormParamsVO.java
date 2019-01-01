package com.moseeker.vo.position;/**
 * Created by zztaiwll on 18/12/25.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className PositionHrPlateFormParamsVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/25 上午11:05
 **/
@Data
@ApiModel(value = "hr平台职位列表的数据模型")
public class PositionHrPlateFormParamsVO {
    @ApiModelProperty(value = "公司编号",dataType = "java.lang.Integer",required = false,example = "39978")
    private Integer companyId;
    @ApiModelProperty(value = "hr编号，逗号隔开",dataType = "java.lang.String",required = false,example = "82752")
    private String publisher;
    @ApiModelProperty(value = "0 超级账号；1：子账号; 2：普通账号",dataType = "java.lang.Integer",required = false,example = "0")
    private Integer accountType;
    @ApiModelProperty(value = "关键字",dataType = "java.lang.Integer",required = false,example = "39978")
    private String  title;
    @ApiModelProperty(value = "职位状态",dataType = "java.lang.String",required = false,example = "java")
    private Integer status;
    @ApiModelProperty(value = "招聘类型",dataType = "java.lang.Integer",required = false,example = "0")
    private Integer candidateSource;
    @ApiModelProperty(value = "工作类型",dataType = "java.lang.Integer",required = false,example = "1")
    private Integer employmentType;
    @ApiModelProperty(value = "是否只看内退",dataType = "java.lang.String",required = false,example = "1")
    private Integer isReferral;
    @ApiModelProperty(value = "每页显示数",dataType = "java.lang.Integer",required = false,example = "10")
    private Integer pageSize;
    @ApiModelProperty(value = "当前页码",dataType = "java.lang.Integer",required = false,example = "1")
    private Integer pageNumber;
    @ApiModelProperty(value = "按照发布人查询的标志位，true是子账号 false是母账号，不传就是全查询",dataType = "java.lang.Boolean",required = false,example = "ture")
    private Boolean flag;
    @ApiModelProperty(value = "子账号编号多个使用逗号隔开",dataType = "java.lang.String",required = false,example = "1")
    private String accountId;


    @ApiModelProperty(value = "红包类型，hr_hb_config.type",dataType = "java.lang.Integer",required = false,example = "1")
    private Integer configStatus;
    @ApiModelProperty(value = "城市",dataType = "java.lang.String",required = false,example = "上海,北京")
    private String cityName;
    @ApiModelProperty(value = "团队id",dataType = "java.lang.Integer",required = false,example = "1,2")
    private Integer teamId;
    @ApiModelProperty(value = "职位id的字符串[1,2,3,4]",dataType = "java.lang.String",required = false,example = "[1,2]")
    private String positionIds;


}
