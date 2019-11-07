package com.moseeker.vo.position;

import lombok.Data;

import java.util.List;

@Data
public class PositionJobNumberOperatorVO {
    private int companyId;
    private int hrId;
    private List<String> jobNumBerList;
}
