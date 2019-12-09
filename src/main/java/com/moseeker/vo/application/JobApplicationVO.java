package com.moseeker.vo.application;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by zztaiwll on 18/9/20.
 */
@Data
public class JobApplicationVO {
    private Integer   id;
    @ApiModelProperty(value = "sys_wechat.id, 公众号ID", dataType = "int")
    private Integer   wechatId;
    @ApiModelProperty(value = "job_position.id, 职位ID", dataType = "int")
    private Integer   positionId;
    @ApiModelProperty(value = "user_wx_user.id, 微信ID。现在已经废弃，推荐者信息请参考recommend_user_id", dataType = "int")
    private Integer   recommenderId;
    @ApiModelProperty(value = "提交时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp submitTime;
    @ApiModelProperty(value = "hr_award_config.id, 申请状态ID", dataType = "int")
    private Integer   statusId;
    @ApiModelProperty(value = "ATS的申请ID", dataType = "int")
    private Integer   lApplicationId;
    @ApiModelProperty(value = "当前申请的积分记录", dataType = "int")
    private Integer   reward;
    @ApiModelProperty(value = "已废弃,job_source.id, 对应的ATS ID", dataType = "int")
    private Integer   sourceId;
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp _CreateTime;
    @ApiModelProperty(value = "sys_user.id, 用户ID", dataType = "int")
    private Integer   applierId;
    @ApiModelProperty(value = "app_interview.id, 面试ID", dataType = "int")
    private Integer   interviewId;
    @ApiModelProperty(value = "mongodb collection application[id]", dataType = "String")
    private String    resumeId;
    @ApiModelProperty(value = "0:unuse, 1:waiting, 2:failed, 3:success, 4:position expire, 5:resume unqualified, 6:excess apply times, 7 redundant,  8:failed, 9 failed and notified", dataType = "int")
    private Integer   atsStatus;
    @ApiModelProperty(value = "姓名或微信昵称", dataType = "String")
    private String    applierName;
    @ApiModelProperty(value = "是否有效，0：有效，1：无效", dataType = "int")
    private Integer   disable;
    @ApiModelProperty(value = "申请来源 0:微信企业端 1:微信聚合端 10:pc端", dataType = "int")
    private Integer   routine;
    @ApiModelProperty(value = "该申请是否被浏览，0：已浏览，1：未浏览", dataType = "java.lang.Byte")
    private Byte      isViewed;
    @ApiModelProperty(value = "是否不合适，0：合适，1：不合适", dataType = "java.lang.Byte")
    private Byte      notSuitable;
    @ApiModelProperty(value = "公司编号", dataType = "int")
    private Integer   companyId;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    @ApiModelProperty(value = "招聘进度", dataType = "int")
    private Integer   appTplId;
    @ApiModelProperty(value = "是否是代理投递 0：正常数据，1：代理假投递", dataType = "java.lang.Byte")
    private Byte      proxy;
    @ApiModelProperty(value = "投递区分， 0：profile投递， 1：email投递", dataType = "int")
    private Integer   applyType;
    @ApiModelProperty(value = "0，有效；1,未收到回复邮件；2，文件格式不支持；3，附件超过10M；9，提取邮件失败", dataType = "int")
    private Integer   emailStatus;
    @ApiModelProperty(value = "profile浏览次数", dataType = "int")
    private Integer   viewCount;
    @ApiModelProperty(value = "userdb.user_user.id 推荐人编号", dataType = "int")
    private Integer   recommenderUserId;
    @ApiModelProperty(value = "来源", dataType = "int")
    private Integer   origin;
    @ApiModelProperty(value = "接口调用方编号",required = false)
    private Integer appid;
    @ApiModelProperty(value = "来源渠道")
    private List<Map<String,String>> channel;
}
