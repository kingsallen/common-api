package com.moseeker.vo.jobboard;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2018/12/4
 * @Author: JackYang
 */
@Data
public class HrThirdPartyAccountHrParamVO implements Serializable{

    public Integer id;
    public Integer thirdPartyAccountId;
    public Integer hrAccountId;
    public Short channel;
    public Byte status;
    public String createTime; 
    public String updateTime; 

}
