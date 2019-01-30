package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/1/29.
 */

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @className EmailAccountConsumptionFormVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/29 下午1:38
 **/
@Data
public class EmailAccountConsumptionFormVO implements Serializable {

    public Integer total; // optional
    public Integer pageNumber; // optional
    public Integer pageSize; // optionalVOVO
    public Integer companyId; // optionalVO
    public List<EmailAccountConsumptionVO> purchases; // optional
}

