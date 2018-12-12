package com.moseeker.vo.redpacket;

/**
 * @ClassName ActivityEstimateAmount
 * @Description 红包活动的预期数据
 * @Author jack
 * @Date 2018/12/5 10:33 AM
 * @Version 1.0
 */
public class ActivityEstimateAmount {

    private int estimateAmount;         //平均金额
    private int estimateBudget;         //预算
    private int estimateCount;          //红包数量

    public int getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(int estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public int getEstimateBudget() {
        return estimateBudget;
    }

    public void setEstimateBudget(int estimateBudget) {
        this.estimateBudget = estimateBudget;
    }

    public int getEstimateCount() {
        return estimateCount;
    }

    public void setEstimateCount(int estimateCount) {
        this.estimateCount = estimateCount;
    }
}
