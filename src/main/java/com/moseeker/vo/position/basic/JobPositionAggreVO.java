package com.moseeker.vo.position.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zztaiwll on 18/8/10.
 */
@ApiModel(value = "职位数据")
@Data
public class JobPositionAggreVO implements Serializable{
    private static final long serialVersionUID = 4607611443672168790L;
    @ApiModelProperty(name="id",value = "id",required = false)
    private Integer   id;
    @ApiModelProperty(name="jobnumber",value = "职位编号 ats",required = false)
    private String    jobnumber;
    @ApiModelProperty(name="companyId",value = "公司编号",required = false)
    private Integer   companyId;
    @ApiModelProperty(name="title",value = "职位名称",required = false)
    private String    title;
    @ApiModelProperty(name="province",value = "省份",required = false)
    private String    province;
    @ApiModelProperty(name="city",value = "城市，再用ats过来的特殊城市使用",required = false)
    private String    city;
    @ApiModelProperty(name="department",value = "部门，不用了",required = false)
    private String    department;
    @ApiModelProperty(name="lJobid",value = "jobid from ATS or other channel",required = false)
    private Integer   lJobid;
    @ApiModelProperty(name="publishDate",value = "发布日期",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp    publishDate;
    @ApiModelProperty(name="stopDate",value = "截止日期",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp    stopDate;
    @ApiModelProperty(name="accountabilities",value = "Job responsibilities职位描述",required = false)
    private String    accountabilities;
    @ApiModelProperty(name="experience",value = "工作经验",required = false)
    private String    experience;
    @ApiModelProperty(name="requirement",value = "职位要求",required = false)
    private String    requirement;
    @ApiModelProperty(name="salary",value = "薪水",required = false)
    private String    salary;
    @ApiModelProperty(name="language",value = "外语要求",required = false)
    private String    language;
    @ApiModelProperty(name="jobGrade",value = "优先级",required = false)
    private Integer   jobGrade;
    @ApiModelProperty(name="status",value = "0 有效, 1 删除, 2 撤下",required = false)
    private Byte      status;
    @ApiModelProperty(name="visitnum",value = "被访问次数",required = false)
    private Integer   visitnum;
    @ApiModelProperty(name="lastvisit",value = "openid of last visiter",required = false)
    private String    lastvisit;
    @ApiModelProperty(name="sourceId",value = "职位来源 0：Moseeker",required = false)
    private Integer   sourceId;
    @ApiModelProperty(name="updateTime",value = "更新时间",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    @ApiModelProperty(name="businessGroup",value = "事业群",required = false)
    private String    businessGroup;
    @ApiModelProperty(name="employmentType",value = "0:全职，1：兼职：2：合同工 3:实习 9:其他",required = false)
    private Byte      employmentType;
    @ApiModelProperty(name="hrEmail",value = "HR联系人邮箱，申请通知",required = false)
    private String    hrEmail;
    @ApiModelProperty(name="benefits",value = "职位福利 不用了",required = false)
    private String    benefits;
    @ApiModelProperty(name="degree",value = "0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士 6:中专 7:高中 8: 博士后 9:初中",required = false)
    private Byte      degree;
    @ApiModelProperty(name="feature",value = "职位特色，多福利特色使用#分割 不用了",required = false)
    private String    feature;
    @ApiModelProperty(name="emailNotice",value = "申请后是否给 HR 发送邮件 0:发送 1:不发送",required = false)
    private Byte      emailNotice;
    @ApiModelProperty(name="candidateSource",value = "0:社招 1：校招",required = false)
    private Byte      candidateSource;
    @ApiModelProperty(name="occupation",value = "职位职能 不用了",required = false)
    private String    occupation;
    @ApiModelProperty(name="isRecom",value = "是否需要推荐0：需要 1：不需要",required = false)
    private Integer   isRecom;
    @ApiModelProperty(name="industry",value = "所属行业",required = false)
    private String    industry;
    @ApiModelProperty(name="hongbaoConfigId",value = "红包配置id",required = false)
    private Integer   hongbaoConfigId;
    @ApiModelProperty(name="hongbaoConfigRecomId",value = "红包配置推荐id",required = false)
    private Integer   hongbaoConfigRecomId;
    @ApiModelProperty(name="hongbaoConfigAppId",value = "",required = false)
    private Integer   hongbaoConfigAppId;
    @ApiModelProperty(name="emailResumeConf",value = "'0:允许使用email简历进行投递；1:不允许使用email简历投递",required = false)
    private Byte      emailResumeConf;
    @ApiModelProperty(name="lPostingtargetid",value = "lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址",required = false)
    private Integer   lPostingtargetid;
    @ApiModelProperty(name="priority",value = "是否置顶",required = false)
    private Byte      priority;
    @ApiModelProperty(name="shareTplId",value = "分享模板id",required = false)
    private Integer   shareTplId;
    @ApiModelProperty(name="district",value = "添加区(省市区的区)",required = false)
    private String    district;
    @ApiModelProperty(name="count",value = "添加招聘人数, 0：不限",required = false)
    private Short     count;
    @ApiModelProperty(name="salaryTop",value = "薪资上限（k）",required = false)
    private Integer   salaryTop;
    @ApiModelProperty(name="salaryBottom",value = "薪资下限（k）",required = false)
    private Integer   salaryBottom;
    @ApiModelProperty(name="experienceAbove",value = "及以上 1：需要， 0：不需要",required = false)
    private Byte      experienceAbove;
    @ApiModelProperty(name="degreeAbove",value = "及以上 1：需要， 0：不需要",required = false)
    private Byte      degreeAbove;
    @ApiModelProperty(name="managementExperience",value = "是否要求管理经验0：需要1：不需要",required = false)
    private Byte      managementExperience;
    @ApiModelProperty(name="gender",value = "0-> female, 1->male, 2->all",required = false)
    private Byte      gender;
    @ApiModelProperty(name="publisher",value = "hr_account.id",required = false)
    private Integer   publisher;
    @ApiModelProperty(name="publisherName",value = "publisherName",required = false)
    private String  publisherName;
    @ApiModelProperty(name="appCvConfigId",value = "职位开启并配置自定义模板 hr_app_cv_conf.id",required = false)
    private Integer   appCvConfigId;
    @ApiModelProperty(name="source",value = "0:手动创建, 1:导入, 9:ATS导入",required = false)
    private Short     source;
    @ApiModelProperty(name="hbStatus",value = "是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动",required = false)
    private Byte      hbStatus;
    @ApiModelProperty(name="childCompanyId",value = "hr_child_company.id 不用了",required = false)
    private Integer   childCompanyId;
    @ApiModelProperty(name="age",value = "年龄要求, 0：无要求",required = false)
    private Byte      age;
    @ApiModelProperty(name="majorRequired",value = "专业要求",required = false)
    private String    majorRequired;
    @ApiModelProperty(name="workAddress",value = "上班地址",required = false)
    private String    workAddress;
    @ApiModelProperty(name="keyword",value = "职位关键词",required = false)
    private String    keyword;
    @ApiModelProperty(name="reportingTo",value = "汇报对象",required = false)
    private String    reportingTo;
    @ApiModelProperty(name="isHiring",value = "是否急招, 1:是 0:否",required = false)
    private Byte      isHiring;
    @ApiModelProperty(name="underlings",value = "下属人数， 0:没有下属",required = false)
    private Byte      underlings;
    @ApiModelProperty(name="languageRequired",value = "语言要求，1:是 0:否",required = false)
    private Byte      languageRequired;
    @ApiModelProperty(name="targetIndustry",value = "期望人选所在行业",required = false)
    private Byte      targetIndustry;
    @ApiModelProperty(name="currentStatus",value = "已经弃用， 0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭",required = false)
    private Byte      currentStatus;
    @ApiModelProperty(name="positionCode",value = "职能字典code, dict_position.code",required = false)
    private Integer   positionCode;
    @ApiModelProperty(name="teamId",value = "职位所属团队",required = false)
    private Integer   teamId;
    @ApiModelProperty(name="profileCcMailEnabled",value = "简历申请是否抄送邮箱，0 否；1 是",required = false)
    private Byte      profileCcMailEnabled;
    @ApiModelProperty(name="isReferral",value = "是否是内推，0 否；1 是",required = false)
    private Byte      isReferral;
    @ApiModelProperty(name="appId",value = "公众号的appid",required = true)
    private String appId;
    @ApiModelProperty(name = "signature",value = "公众号的signature",required = true)
    private String signature;
}
