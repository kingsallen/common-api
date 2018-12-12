package com.moseeker.vo.redpacket;

import com.moseeker.util.validation.ValidateUtil;
import com.moseeker.util.validation.rules.DateType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 红包活动数据
 */
@ApiModel(value = "红包活动表单信息")
public class ActivityVO {

    @ApiModelProperty(value = "id",required = false)
    private Integer id;
    @ApiModelProperty(value = "红包活动类型。0:员工认证红包，1:推荐评价红包，2:转发被点击红包，3:转发被申请红包， 4:推荐通过初筛红包",required = false)
    private Integer type;
    @ApiModelProperty(value = "公司编号",required = false)
    private Integer companyId;
    @ApiModelProperty(value = "红包领取对象 0:员工，1:员工及员工二度，2:粉丝",required = false)
    private Integer target;
    @ApiModelProperty(value = "开始时间",required = false)
    private String startTime;
    @ApiModelProperty(value = "结束时间",required = false)
    private String endTime;
    @ApiModelProperty(value = "红包活动预算",required = false)
    private Integer totalAmount;
    @ApiModelProperty(value = "单个红包金额的下限，大于或等于。",required = false)
    private Double rangeMin;
    @ApiModelProperty(value = "单个红包金额的上限，小于或等于。",required = false)
    private Double rangeMax;
    @ApiModelProperty(value = "中奖概率。",required = false)
    private Integer probability;
    @ApiModelProperty(value = "抽奖页面标题。",required = false)
    private String headline;
    @ApiModelProperty(value = "抽奖失败页面标题。",required = false)
    private String headlineFailure;
    @ApiModelProperty(value = "转发消息标题。",required = false)
    private String shareTitle;
    @ApiModelProperty(value = "转发消息摘要。",required = false)
    private String shareDesc;
    @ApiModelProperty(value = "转发消息背景图地址。",required = false)
    private String shareImg;
    @ApiModelProperty(value = "参与红包活动的职位编号集合。",required = false)
    private List<Integer> positionIds;

    @ApiModelProperty(value = "操作红包活动的用户编号。",required = true)
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
