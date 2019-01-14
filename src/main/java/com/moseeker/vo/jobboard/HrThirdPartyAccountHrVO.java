package com.moseeker.vo.jobboard;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2018/12/4
 * @Author: JackYang
 */
@Data
public class HrThirdPartyAccountHrVO implements Serializable{

    public int id; 
    public int thirdPartyAccountId; 
    public int hrAccountId; 
    public short channel; 
    public byte status; 
    public String createTime; 
    public String updateTime; 

}
