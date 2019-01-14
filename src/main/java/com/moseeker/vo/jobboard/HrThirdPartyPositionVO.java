package com.moseeker.vo.jobboard;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import static com.moseeker.constant.jobboard.JobboardConstants.CHANNEL;
import static com.moseeker.constant.jobboard.JobboardConstants.IS_SYNCHRONIZATION;

@Data
public class HrThirdPartyPositionVO {


    @ApiModelProperty("主键")
    private int id;

    @ApiModelProperty("职位ID")
    private int positionId;

    @ApiModelProperty("第三方渠道编号")
    private String thirdPartPositionId;

    @ApiModelProperty(IS_SYNCHRONIZATION)
    private int isSynchronization;

    @ApiModelProperty("是否刷新:0=未刷新,1=刷新,2=刷新中")
    private int isRefresh;

    @ApiModelProperty("职位同步时间")
    private String syncTime;

    @ApiModelProperty("职位刷新时间")
    private String refreshTime;

    @ApiModelProperty("数据更新时间")
    private String updateTime;

    @ApiModelProperty("详细地址")
    private String address;

    @ApiModelProperty("同步时选中的第三方职位职能")
    private String occupation;

    @ApiModelProperty("失败原因")
    private String syncFailReason;

    @ApiModelProperty("使用企业地址")
    private int useCompanyAddress;

    @ApiModelProperty("第三方账号ID")
    private int thirdPartyAccountId;

    @ApiModelProperty(CHANNEL)
    private int channel;

    @ApiModelProperty("同步时自定义或者匹配的部门名")
    private String department;

    @ApiModelProperty("发放月薪数")
    private int salaryMonth;

    @ApiModelProperty("招聘反馈时长")
    private int feedbackPeriod;

    @ApiModelProperty("是否显示为面议0否1是")
    private int salaryDiscuss;

    @ApiModelProperty("薪资底线")
    private int salaryBottom;

    @ApiModelProperty("薪资封顶")
    private int salaryTop;

    @ApiModelProperty("实习薪资，完整薪资")
    private int practiceSalary;

    @ApiModelProperty("实习薪资单位，0：元/月，1：元/天")
    private byte practicePerWeek;

    @ApiModelProperty("每周实习天数")
    private byte practiceSalaryUnit;

    @ApiModelProperty("绑定第三方账号对应公司的id，关联thirdparty_account_company的id")
    private int companyId;

    @ApiModelProperty("绑定第三方账号对应公司的名称")
    private String companyName;

    @ApiModelProperty("绑定第三方账号对应地址的id，关联thirdparty_account_company_address的id")
    private int addressId;

    @ApiModelProperty("绑定第三方账号对应地址的名称")
    private String addressName;

    @ApiModelProperty("绑定第三方账号对应部门的id，关联thirdparty_account_department的id")
    private int departmentId;

    @ApiModelProperty("绑定第三方账号对应部门的名称")
    private String departmentName;

    @ApiModelProperty("招聘人数")
    private int count;

    @ApiModelProperty("是否使用实习职位的额度,0：不使用，1：使用，暂时只有51使用")
    private byte internship;

    @ApiModelProperty("职位特色，每个特色不超过8个字，总特色数不超过16个，用于回显猎聘第三方补填页面福利特色，由于猎聘职位福利特色可以编辑，且不影响仟寻职位福利特色，因此加了这个字段保存福利特色相关信息，多个福利特色用,隔开")
    private String feature;

}
