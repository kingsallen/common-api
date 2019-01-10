package com.moseeker.vo.redpacket;

import java.util.List;

/**
 * @ClassName ActivityListVO
 * @Description 红包活动列表的红包数据
 * @Author jack
 * @Date 2018/12/7 5:34 PM
 * @Version 1.0
 */
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
    private Byte dType;

    private List<Position> positionList;

    public Position buildPosition() {
        return new Position();
    }

    public class Position {
        private int id;
        private String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(Double rangeMin) {
        this.rangeMin = rangeMin;
    }

    public Double getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(Double rangeMax) {
        this.rangeMax = rangeMax;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadlineFailure() {
        return headlineFailure;
    }

    public void setHeadlineFailure(String headlineFailure) {
        this.headlineFailure = headlineFailure;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getShareImg() {
        return shareImg;
    }

    public void setShareImg(String shareImg) {
        this.shareImg = shareImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }

    public Double getRemain() {
        return remain;
    }

    public void setRemain(Double remain) {
        this.remain = remain;
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }

    public Byte getdType() {
        return dType;
    }

    public void setdType(Byte dType) {
        this.dType = dType;
    }
}
