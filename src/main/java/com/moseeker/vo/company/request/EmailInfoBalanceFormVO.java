package com.moseeker.vo.company.request;/**
 * Created by zztaiwll on 19/1/29.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className EmailInfoBalanceFormVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/29 上午11:49
 **/
@Data
public class EmailInfoBalanceFormVO {
    private static final long serialVersionUID = -1479025538494809032L;

    @ApiModelProperty(value = "公司ID",required = true,example = "39978")
    Integer companyId;
    @ApiModelProperty(value = "邮件使用量",required = true,example = "1")
    Integer useBalance;
}
