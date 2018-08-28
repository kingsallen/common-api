package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.common.QueryVo;
import lombok.Data;

/**
 * @author cjm
 * @date 2018-08-28 14:21
 **/
@Data
public class IndustryTypeQueryVO extends QueryVo {
    public String equal_filter_name;
    public Integer equal_filter_code;
    public String equal_filter_company_img;
    public String equal_filter_job_img;
    public String equal_filter_team_img;
    public String equal_filter_pc_img;
}
