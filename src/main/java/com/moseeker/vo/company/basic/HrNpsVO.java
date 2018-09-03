/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * nps打分推荐表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "nps打分推荐")
public class HrNpsVO   {

    private static final long serialVersionUID = 1253734684;

    private Integer   id;
    private Integer   hrAccountId;
    @ApiModelProperty(value = "推荐同行的意愿【0-10】")
    private Byte      intention;
    @ApiModelProperty(value = "是否愿意接听电话 0-未确认，1-愿意，2-不愿意")
    private Byte      acceptContact;
    private Timestamp createTime;
    private Timestamp updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHrAccountId() {
        return hrAccountId;
    }

    public void setHrAccountId(Integer hrAccountId) {
        this.hrAccountId = hrAccountId;
    }

    public Byte getIntention() {
        return intention;
    }

    public void setIntention(Byte intention) {
        this.intention = intention;
    }

    public Byte getAcceptContact() {
        return acceptContact;
    }

    public void setAcceptContact(Byte acceptContact) {
        this.acceptContact = acceptContact;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
