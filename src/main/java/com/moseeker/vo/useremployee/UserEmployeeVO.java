package com.moseeker.vo.useremployee;/**
 * Created by zztaiwll on 18/12/11.
 */

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @version 1.0
 * @className UserEmployeeVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/11 下午2:33
 **/
@Data
public class UserEmployeeVO {
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
    private Integer   teamId;
    private Byte      jobGrade;
    private Integer   cityCode;
    private Byte      degree;
    private Integer   bonus;
}
