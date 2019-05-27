package com.moseeker.vo.redpacket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName ActivityListVO
 * @Description 红包活动列表的红包数据
 * @Author jack
 * @Date 2018/12/7 5:34 PM
 * @Version 1.0
 */
@Data
public class ActivityListVO {

    private Integer id;
    private Integer type;
    private Integer companyId;
    private Integer target;
    private String startTime;
    private String endTime;
    private Double totalAmount;
    private Double rangeMin;
    private Double rangeMax;
    private Integer probability;
    private String headline;
    private String headlineFailure;
    private String shareTitle;
    private String shareDesc;
    private String shareImg;

    private Integer status;
    private Integer check;
    private Double remain;
    @JsonProperty(value = "dType")
    private Byte dType;

    private Double throttle;

    private Integer estimatedTotal;

    private List<Position> positionList;

    public Position buildPosition() {
        return new Position();
    }

    @Data
    public class Position {
        private int id;
        private String title;
    }
}
