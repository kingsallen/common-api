package com.moseeker.vo.company.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moseeker.vo.company.basic.HrInterviewProcessRoundVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Date: 2019/1/28
 * @Author: JackYang
 */
@ApiModel(value = "HrInterviewProcessDataVO")
@Data
public class HrInterviewProcessDataVO {

    @ApiModelProperty(value = "序列ID")
    private Integer  id;
    @ApiModelProperty(value = "公司ID")
    private Integer   companyId ;
    @ApiModelProperty(value = "HR ID")
    private Integer hrId;
    @ApiModelProperty(value = "面试流程名称")
    private String processName;
    @ApiModelProperty(value = "状态 0 有效 1无效")
    private Integer disabled;
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-11-28 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-11-28 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

    @ApiModelProperty(value = "面试阶段数据")
    private List<HrInterviewProcessRoundVO> hrInterviewProcessRoundDatas;

}
