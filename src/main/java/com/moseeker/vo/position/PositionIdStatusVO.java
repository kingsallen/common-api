package com.moseeker.vo.position;

import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class PositionIdStatusVO {

    private Integer companyId;
    private List<Integer> idList;
    private Integer notStatus;

    public PositionIdStatusVO(Integer companyId, List<Integer> idList, Integer notStatus) {
        this.companyId = companyId;
        this.idList = idList;
        this.notStatus = notStatus;
    }
}
