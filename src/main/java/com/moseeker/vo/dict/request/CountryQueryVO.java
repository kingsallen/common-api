package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class CountryQueryVO extends QueryVo {
    public Integer equal_filter_id;
    public String equal_filter_ename;
    public String equal_filter_name;
    public Integer equal_filter_priority;
    public Integer equal_filter_code;
    public Integer equal_filter_iso_code_2;
    public Integer equal_filter_iso_code_3;
    public Integer equal_filter_sms_enabled;
    public Integer equal_filter_icon_class;
    public Integer equal_filter_hot_country;
    public Integer equal_filter_continent_code;
}
