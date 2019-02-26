package com.moseeker.vo.jobboard;

import lombok.Data;

import java.util.List;

/**
 * HeadHunterFormVO
 *
 * @Author: lee
 * @Date: 2019/2/14
 */
@Data
public class HeadHunterFormVO {
    /**
     * 猎头编号集合
     */
    private List<Integer> headHunterIdList;
    /**
     * 职位编号
     */
    private Integer positionId;
    /**
     * 操作人
     */
    private Integer hrId;
    /**
     * 对接渠道
     */
    private Integer channel;

    /**
     * 公司Id
     */
    private Integer companyId;
}
