package com.moseeker.vo.company.basic;

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
    private Timestamp bindingTime;
    private String    email;
    private Byte      activation;
    private String    activationCode;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      authLevel;
    private Timestamp registerTime;
    private String    registerIp;
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
