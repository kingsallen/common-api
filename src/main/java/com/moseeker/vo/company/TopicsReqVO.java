package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicsReqVO {
    private Integer companyId;
    private Integer userId;
    private Integer pageSize;
    private Integer pageNo;
    private boolean usePagination;
    private Integer accountType;
    private Integer id;


}
