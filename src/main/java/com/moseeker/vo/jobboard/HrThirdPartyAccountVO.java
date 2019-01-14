package com.moseeker.vo.jobboard;

import lombok.Data;

@Data
public class HrThirdPartyAccountVO {

    private int id;
    private short channel;
    private String username;
    private String password;
    private short binding;
    private int companyId;
    private int remainNum;
    private String syncTime;
    private String updateTime;
    private String createTime;
    private int remainProfileNum;
    private String errorMessage;
    private String ext;
    private byte syncRequireCompany;
    private byte syncRequireDepartment;
    private String ext2;
    
}
