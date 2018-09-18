package com.moseeker.vo.company;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrNpsStatisticVO {
	
    private int total;
    private int page;
    private int pageSize;
    private List<HrNpsInfoVO> data;

}
