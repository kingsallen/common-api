package com.moseeker.vo.talentpool.bean;

import io.swagger.annotations.ApiModel;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by zztaiwll on 18/1/11.
 * 验证一些基本信息的类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ValidateCommonBean {
    //未使用的id
    private Set<Integer> unuseId;
    //使用的id
    private Set<Integer> useId;


}
