package com.moseeker.vo.position.basic;

import lombok.Data;

@Data
public class JobCustomVO {

    private int id;
    private int companyId;
    private byte status;
    private String name;
    private byte type;
    private String createTime;
    private String updateTime;
    
}
