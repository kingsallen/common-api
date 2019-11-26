package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/4.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className JobApplicationDataVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/4 下午2:58
 **/
@Data
@ApiModel("申请数据内容")
public class JobApplicationDataVO extends JobApplicationVO {
    @ApiModelProperty(value = "城市数据",name = "city",required = true,dataType = "java.util.List",example = "['上海','北京']")
    private List<String> city;
    @ApiModelProperty(value = "职位发布人ID",name = "publisher",required = true,dataType = "java.lang.int",example = "82752")
    private int publisher;
    @ApiModelProperty(value = "职位发布人姓名",name = "publisherName",required = true,dataType = "java.lang.String",example = "王坤")
    private String publisherName;
    @ApiModelProperty(value = "职位状态 0有效 1删除 2下架",name = "positionStatus",required = true,dataType = "java.lang.int",example = "0")
    private int positionStatus;
    @ApiModelProperty(value = "职位名称",name = "positionName",required = false,dataType = "java.lang.String",example = "嘻嘻嘻Java")
    private String positionName;
    @ApiModelProperty(value = "推荐人名称",name = "recomName",required = false,dataType = "java.lang.String",example = "李晓华")
    private String recomName;
    @ApiModelProperty(value = "申请进度",name = "progresstatus",required = false,dataType = "java.lang.int",example = "1")
    private int progressStatus;
    @ApiModelProperty(value = "员工id",name = "recomId",required = false,dataType = "java.lang.String",example = "dsasdasdas")
    private String recomId;
    @ApiModelProperty(value = "员工微信头像",name = "recomHeadimg",required = false,dataType = "java.lang.String",example = "dshasdhasld")
    private String recomHeadimg;
    @ApiModelProperty(value = "上一个申请状态",name = "lastProgressStatus",required = false,dataType = "java.lang.int",example = "1")
    private int lastProgressStatus;
    @ApiModelProperty(value = "ats大阶段状态",name = "parentProcessId",required = false,dataType = "java.lang.int",example = "1")
    private int parentProcessId;
    @ApiModelProperty(value = "ats 上一个申请状态",name = "lastProcessId",required = false,dataType = "java.lang.int",example = "1")
    private int lastProcessId;
    @ApiModelProperty(value = "推荐人手机号",name = "RecomMobile",required = false,dataType = "java.lang.String",example = "1")
    private String RecomMobile;
    @ApiModelProperty(value = "推荐人邮箱",name = "recomEmail",required = false,dataType = "java.lang.String",example = "1")
    private String recomEmail;
    @ApiModelProperty(value = "认证方式新消息",name = "recomAuthMessage",required = false,dataType = "java.lang.String",example = "1")
    private String customField;
    @ApiModelProperty(value = "阶段id",name = "phaseId",required = false,dataType = "java.lang.int",example = "1")
    private int phaseId;
    @ApiModelProperty(value = "流程id",name = "processId",required = false,dataType = "java.lang.int",example = "1")
    private int processId;
    @ApiModelProperty(value = "阶段名称",name = "phaseName",required = false,dataType = "java.lang.string",example = "qqqq")
    private String phaseName;
    @ApiModelProperty(value = "申请的渠道来源")
    private List<ApplicationChannelVO> channels;
}
