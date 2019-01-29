package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/1/29.
 */

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @className EmailAccountFormVO
        * @Description TODO
        * @Author zztaiwll
        * @DATE 19/1/29 上午11:53
        **/
@Data
public class EmailAccountFormVO implements Serializable {
    public int total; // optional
    public int pageNumber; // optional
    public int pageSize; // optional
    public int companyId; // optional
    List<EmailAccountInfoVO> emailAccounts;
}