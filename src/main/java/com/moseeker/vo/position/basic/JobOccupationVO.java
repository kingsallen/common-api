package com.moseeker.vo.position.basic;

import lombok.Data;

@Data
public class JobOccupationVO {

    private int id;
    private int companyId;
    private byte status;
    private String name;
    private String updateTime;
    private String createTime;
    
}
