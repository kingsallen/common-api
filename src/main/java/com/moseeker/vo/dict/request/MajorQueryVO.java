package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class MajorQueryVO extends QueryVo {
    public String equal_filter_name;
    public Integer equal_filter_code;
    public Integer equal_filter_level;
}
