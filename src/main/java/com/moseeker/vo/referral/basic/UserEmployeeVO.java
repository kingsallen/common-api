package com.moseeker.vo.referral.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Date: 2018/11/11
 * @Author: JackYang
 */
@Data
public class UserEmployeeVO implements Serializable
{

    private static final long serialVersionUID = 3464556717899187946L;
    private Integer   id;
    private String    employeeid;
    private Integer   companyId;
    private Integer   roleId;
    private Integer   wxuserId;
    private Byte      sex;
    private String    ename;
    private String    efname;
    private String    cname;
    private String    cfname;
    private String    password;
    private Byte      isAdmin;
    private Integer   status;
    private String    companybody;
    private String    departmentname;
    private String    groupname;
    private String    position;
    private Date employdate;
    private String    managername;
    private String    city;
    private Date      birthday;
    private Date      retiredate;
    private String    education;
    private String    address;
    private String    idcard;
    private String    mobile;
    private Integer   award;
    @ApiModelProperty(value = "bindingTime", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp bindingTime;
    private String    email;
    private Byte      activation;
    private String    activationCode;
    private Byte      disable;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    private Byte      authLevel;
    @ApiModelProperty(value = "registerTime", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp registerTime;
    private String    registerIp;
    @ApiModelProperty(value = "lastLoginTime", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp lastLoginTime;
    private String    lastLoginIp;
    private Long      loginCount;
    private Byte      source;
    private String    downloadToken;
    private Integer   hrWxuserId;
    private String    customField;
    private Byte      isRpSent;
    private Integer   sysuserId;
    private Integer   positionId;
    private Integer   sectionId;
    private Byte      emailIsvalid;
    private Byte      authMethod;
    private String    customFieldValues;
    private Integer   cityCode;
    private Byte      degree;
    private Byte      jobGrade;
    private Integer   teamId;
}
