package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/5/22.
 */
@ApiModel(value="职位查询es的对象类型")
@Data
public class PositionQueryParams {
    @ApiModelProperty(value="从第几页开始" ,required=true)
    private Integer pageFrom;
    @ApiModelProperty(value="每页数量" ,required=true)
    private Integer pageSize;
    @ApiModelProperty(value="关键词" ,required=false)
    private String  keywords;
    @ApiModelProperty(value="城市，逗号隔开" ,required=false)
    private String  cities;
    @ApiModelProperty(value="行业，逗号隔开" ,required=false)
    private String  industries;
    @ApiModelProperty(value="自定义职位职能，逗号隔开" ,required=false)
    private String  occupations;
    @ApiModelProperty(value="公司规模" ,required=false)
    private String  scale;
    @ApiModelProperty(value="招聘类型 0社招 1校招" ,required=false)
    private String  candidateSource;
    @ApiModelProperty(value="工作类型 0 全职 1兼职 2合同工 3实习 9其他" ,required=false)
    private String  employmentType;
    @ApiModelProperty(value="经验" ,required=false)
    private String  experience;
    @ApiModelProperty(value="工资" ,required=false)
    private String  salary;
    @ApiModelProperty(value="学历" ,required=false)
    private String  degree;
    @ApiModelProperty(value="母公司编号" ,required=false)
    private String  companyId;
    @ApiModelProperty(value="发布职位的公司编号" ,required=false)
    private String  did;
    @ApiModelProperty(value="团队名称" ,required=false)
    private String  teamName;
    @ApiModelProperty(value="是否按照优先级排序" ,required=false)
    private Integer orderByPriority;
    @ApiModelProperty(value="自定义字段" ,required=false)
    private String  custom;
    @ApiModelProperty(value="职位状态" ,required=false)
    private Integer status;
    @ApiModelProperty(value="职位发布人id" ,required=false)
    private String  publisher;
    @ApiModelProperty(value="指定返回值" ,required=false)
    private String  returnParams;
    @ApiModelProperty(value="团队id" ,required=false)
    private String  teamId;
    @ApiModelProperty(value="职位模块id" ,required=false)
    private String  moduleId;
    @ApiModelProperty(value="开始时间" ,required=false)
    private String  startTime;
    @ApiModelProperty(value="结束时间" ,required=false)
    private String  endTime;
    @ApiModelProperty(value="城市编号" ,required=false)
    private String  cityCode;
    @ApiModelProperty(value="排序字段" ,required=false)
    private Integer order;

}
