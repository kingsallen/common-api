package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterDataExportVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("猎头数据导出VO")
public class HeadhunterDataVO {

    @ApiModelProperty(value = "猎头公司名称")
    private String hunterCompanyName;
    @ApiModelProperty(value = "合同类型")
    private String contractType;
    @ApiModelProperty(value = "合同期限")
    private String contractPeriod;
    @ApiModelProperty(value = "猎头顾问")
    private String headhunterName;
    @ApiModelProperty(value = "职位名称")
    private String positionName;
    @ApiModelProperty(name ="status",value = "职位状态 0：正常，1：停止，2：删除",example = "0", dataType="java.lang.Integer")
    private Byte status;
    @ApiModelProperty(value = "筛选人数")
    private Integer screenCount;
    @ApiModelProperty(value = "面试人数")
    private Integer InterviewCount;
    @ApiModelProperty(value = "录用人数")
    private Integer offerCount;
    @ApiModelProperty(value = "入职人数")
    private Integer entryCount;
    @ApiModelProperty(value = "开放时间")
    private String openDate;
    @ApiModelProperty(value = "进行时间")
    private Integer startingTime;
    @ApiModelProperty(value = "费用")
    private Double cost;

}
