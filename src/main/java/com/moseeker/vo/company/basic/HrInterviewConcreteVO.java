package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Date: 2019/2/22
 * @Author: JackYang
 */
@Data
@ApiModel("HrInterviewConcreteVO")
public class HrInterviewConcreteVO {

    @ApiModelProperty(name = "id",value = "编号",required = true)
    private Integer id;

    @ApiModelProperty(name = "companyId",value = "公司id",required = true)
    private Integer companyId;

    @ApiModelProperty(name = "appId",value = "申请id",required = true)
    private Integer appId;

    @ApiModelProperty(name = "applierId",value = "申请人ID",required = true)
    private Integer applierId;

    @ApiModelProperty(name = "hrId",value = "hr id",required = true)
    private Integer hrId;

    @ApiModelProperty(name = "interviewer_id",value = "面试官id",required = true)
    private Integer interviewerId;

    @ApiModelProperty(name = "interview_address_id",value = "面试地点编号 hr_interview_address.id",required = true)
    private Integer interviewAddressId;

    @ApiModelProperty(name = "interview_type",value = "面试形式 dictdb.dict_constant",required = true)
    private Integer interviewType;

    @ApiModelProperty(name = "interview_round_name",value = "面试轮次名称  hr_interview_process_round.name",required = true)
    private String interviewRoundName;

    @ApiModelProperty(name = "interviewFeedbackSheetId",value = "面试反馈表的id hr_interview_feedback_result_answer_sheet.id")
    private Integer interviewFeedbackSheetId;

    @ApiModelProperty(name = "interview_process_id",value = "面试反馈表模版ID hr_interview_process.id",required = true)
    private Integer interviewTemplateId;

    @ApiModelProperty(name = "concrete_order",value = "面试安排 排序字段")
    private Integer concreteOrder;

    @ApiModelProperty(value = "面试开始时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp startTime;

    @ApiModelProperty(value = "面试结束时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp endTime;

    @ApiModelProperty(name = "finished",value ="0 未完成 1完成",required = true)
    private Integer finished =0 ;

    @ApiModelProperty(name = "disable",value ="状态：0 有效  1 无效 2 逻辑删除",required = true)
    private Integer disable =0;

    @ApiModelProperty(value ="是否通过 0 不通过 1 通过 2 未参加面试",required = true)
    private Integer passed ;

    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;


    @ApiModelProperty(value = "其他联系人姓名", dataType= "string", example = "张三")
    private String contactName;

    @ApiModelProperty(value = "其他联系人电话", dataType= "string", example = "15269385693")
    private String contactPhone;



}
