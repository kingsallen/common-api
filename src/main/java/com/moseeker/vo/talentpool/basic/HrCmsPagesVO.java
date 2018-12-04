package com.moseeker.vo.talentpool.basic;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Date: 2018/11/28
 * @Author: JackYang
 */
@Data
public class HrCmsPagesVO implements Serializable{

    private static final long serialVersionUID = 7370467313821162287L;

    private Integer   id;
    private Integer   configId;
    private Integer   type;
    private Integer   disable;
    private Timestamp createTime;
    private Timestamp updateTime;
}
