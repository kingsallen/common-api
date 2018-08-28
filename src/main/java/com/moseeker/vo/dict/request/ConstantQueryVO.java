package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class ConstantQueryVO extends QueryVo {
    public Integer equal_filter_code;
    public Integer equal_filter_id;
    public Integer equal_filter_priority;
    public String equal_filter_name;
    public String equal_filter_create_time;
    public String equal_filter_update_time;
    public Integer equal_filter_parent_code;
}
