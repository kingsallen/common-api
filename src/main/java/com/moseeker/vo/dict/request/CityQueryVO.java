package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class CityQueryVO extends QueryVo {
    public Integer equal_filter_code;
    public Integer equal_filter_level;
    public String equal_filter_name;
    public Integer equal_filter_hot_city;
    public Integer equal_filter_active;
    public String equal_filter_ename;
}
