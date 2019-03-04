package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/1/29.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @className EmailAccountConsumptionVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/29 下午1:37
 **/
@Data
public class EmailAccountConsumptionVO implements Serializable {

    private static final long serialVersionUID = 7407599832549664182L;

    public Integer id; // optional
    public Integer companyId; // optional
    public Byte type; // optional
    public Integer lost; // optional
    public String createTime; // optional

}
