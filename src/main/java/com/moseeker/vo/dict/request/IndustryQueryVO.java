package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class IndustryQueryVO extends QueryVo {
    public Integer equal_filter_code;
    public String equal_filter_name;
    public Integer equal_filter_type;
}
