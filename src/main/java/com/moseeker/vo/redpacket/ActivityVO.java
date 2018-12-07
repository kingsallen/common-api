package com.moseeker.vo.redpacket;

import com.moseeker.util.validation.ValidateUtil;
import com.moseeker.util.validation.rules.DateType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 红包活动数据
 */
public class ActivityVO {

    private Integer id;
    private Integer type;
    private Integer companyId;
    private Integer target;
    private String startTime;
    private String endTime;
    private Integer totalAmount;
    private Double rangeMin;
    private Double rangeMax;
    private Integer probability;
    private String headline;
    private String headlineFailure;
    private String shareTitle;
    private String shareDesc;
    private String shareImg;
    private List<Integer> positionIds;

    private Integer hrId;

    private static final String AMOUNT_CONFIG_ERROR = "红包上下限制设置有误!";
    private static final String POSITIONS_PARAM_ERROR = "参与红包活动的职位数据选择的有重复数据!";

    public String validate() {
        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addDateValidate("活动开始时间", getStartTime(), DateType.longDate);
        validateUtil.addDateValidate("活动结束时间", getEndTime(), DateType.longDate);
        validateUtil.addIntTypeValidate("红包总预算", getTotalAmount(), 10, 8888889);
        validateUtil.addDoubleTypeValidate("红包下限", getRangeMin(), 1d, 201d);
        validateUtil.addDoubleTypeValidate("红包上限", getRangeMax(), 1d, 201d);
        validateUtil.addIntTypeValidate("中奖概率", getProbability(), 1, 101);
        validateUtil.addStringLengthValidate("抽奖页面", getHeadline(), 0, 513);
        validateUtil.addStringLengthValidate("抽象失败页面标题", getHeadlineFailure(), 0, 513);
        validateUtil.addStringLengthValidate("转发消息标题", getShareTitle(), 0, 513);
        validateUtil.addStringLengthValidate("转发消息摘要", getShareDesc(), 0, 513);
        validateUtil.addStringLengthValidate("转发消息背景图地址", getShareImg(), 0, 513);
        String validateResult = validateUtil.validate();

        if (getRangeMax() != null && getRangeMin() != null
                && getRangeMax() < getRangeMin()) {
            validateResult = StringUtils.isNoneBlank(validateResult)?validateResult+";"+AMOUNT_CONFIG_ERROR:AMOUNT_CONFIG_ERROR;
        }

        if (positionIds != null) {
            if (positionIds.stream().distinct().count() == positionIds.size()) {
                validateResult = StringUtils.isNoneBlank(validateResult)?validateResult+";"+POSITIONS_PARAM_ERROR:POSITIONS_PARAM_ERROR;
            }
        }

        return validateResult;
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

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
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

    public List<Integer> getPositionIds() {
        return positionIds;
    }

    public void setPositionIds(List<Integer> positionIds) {
        this.positionIds = positionIds;
    }

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }
}
