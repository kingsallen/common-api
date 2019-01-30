package com.moseeker.vo.company.request;/**
 * Created by zztaiwll on 19/1/29.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @className RechargeEmailAccountFormVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/29 下午1:53
 **/
@Data
public class RechargeEmailAccountFormVO  implements Serializable {

    @ApiModelProperty(value = "公司ID",required = true,example = "39978")
    Integer companyId;
    @ApiModelProperty(value = "已使用数量",required = true,example = "1")
    Integer lost;
}
