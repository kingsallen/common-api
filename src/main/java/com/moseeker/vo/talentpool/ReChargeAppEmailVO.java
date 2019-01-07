package com.moseeker.vo.talentpool;/**
 * Created by zztaiwll on 19/1/7.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className ReChargeAppEmailVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/7 下午5:20
 **/
@Data
@ApiModel("修改建立进度时，处理邮件的数据模型")
public class ReChargeAppEmailVO {
    @ApiModelProperty(value = "")
   private int useCount;
    @ApiModelProperty(value = "")
   private int companyId;
    @ApiModelProperty(value = "")
   private int balance;
    @ApiModelProperty(value = "")
   private int index;

}
