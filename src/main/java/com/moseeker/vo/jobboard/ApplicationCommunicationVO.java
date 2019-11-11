package com.moseeker.vo.jobboard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ApplicationCommunicationVO
 *
 * @Author: song
 * @Date: 2019/9/10
 */
import java.sql.Timestamp;

@Data
public class ApplicationCommunicationVO {
    @ApiModelProperty(value = "id")
    private Integer   id;
    @ApiModelProperty(value = "沟通类型")
    private Byte      communicationType;
    @ApiModelProperty(value = "申请id")
    private Integer   jobApplicationId;
    @ApiModelProperty(value = "沟通对应id")
    private Integer remarkId;
    @ApiModelProperty(value = "沟通内容")
    private String content;
    @ApiModelProperty(value = "创建者id")
    private Integer creatorId;
    @ApiModelProperty(value = "沟通状态")
    private Byte communicationStatus;
    @ApiModelProperty(value = "创建者id")
    private Byte creatorType;
    @ApiModelProperty(value = "创建时间(无需填写)")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间(无需填写)")
    private Timestamp updateTime;

}
