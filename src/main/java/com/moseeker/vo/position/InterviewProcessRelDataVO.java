package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@ApiModel("职位和面试流程关系数据模型")
public class InterviewProcessRelDataVO {
    private Integer   positionId;
    private Integer   interviewProcessId;
}