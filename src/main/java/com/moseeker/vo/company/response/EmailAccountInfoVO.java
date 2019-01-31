package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/1/29.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @className EmailAccountInfoVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/29 上午11:51
 **/
@Data
public class EmailAccountInfoVO implements Serializable {

    public int id;
    public int companyId;
    public String abbersive;
    public int balance;
    public int total;
    public int useNum;
}
