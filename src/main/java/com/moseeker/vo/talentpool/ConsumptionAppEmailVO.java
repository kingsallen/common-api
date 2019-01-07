package com.moseeker.vo.talentpool;/**
 * Created by zztaiwll on 19/1/7.
 */

import lombok.Data;

/**
 * @version 1.0
 * @className ConsumptionAppEmailVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/7 下午5:34
 **/
@Data
public class ConsumptionAppEmailVO extends ReChargeAppEmailVO {
    private Integer type;

    private Integer hrId;
}
