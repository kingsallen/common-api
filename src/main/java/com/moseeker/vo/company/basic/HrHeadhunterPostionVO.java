package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * HrHeadhunterPostionVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("职位数据VO")
public class HrHeadhunterPostionVO {

    @ApiModelProperty(value = "职位名称")
    private String positionName;
    @ApiModelProperty(value = "地区")
    private String cityName;
    @ApiModelProperty(value = "部门")
    private String departmentName;
    @ApiModelProperty(value = "发布人")
    private String hrName;
    @ApiModelProperty(value = "发布时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp syncTime;
    @ApiModelProperty(value = "候选人数")
    private String candidateCount;

}
