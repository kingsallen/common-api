package com.moseeker.vo.jobboard;

import lombok.Data;

@Data
public class ThirdPartyPositionFormVO {

    private int positionId;
    private int appid;
    private java.util.List<String> channels;
    private int requestType;
    
}
