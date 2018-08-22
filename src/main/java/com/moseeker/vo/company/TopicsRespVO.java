package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicsRespVO {

    private int id;
    private List<PositionVO> positions ;
    private TopicCoverPOJO cover;
    private TopicStyleVO style;
    private TopicsCompanyVO company;
    private int accountType;
    private String username;
    private int accountId;
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PositionVO> getPositions() {
        return positions;
    }

    public void setPositions(List<PositionVO> positions) {
        this.positions = positions;
    }

    public TopicCoverPOJO getCover() {
        return cover;
    }

    public void setCover(TopicCoverPOJO cover) {
        this.cover = cover;
    }

    public TopicStyleVO getStyle() {
        return style;
    }

    public void setStyle(TopicStyleVO style) {
        this.style = style;
    }

    public TopicsCompanyVO getCompany() {
        return company;
    }

    public void setCompany(TopicsCompanyVO company) {
        this.company = company;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
