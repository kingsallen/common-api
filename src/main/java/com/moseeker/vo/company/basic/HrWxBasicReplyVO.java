/*
 * This file is generated by jOOQ.
*/
package com.moseeker.vo.company.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信文本回复表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "微信文本回复")
public class HrWxBasicReplyVO {

    private static final long serialVersionUID = 606270012;

    private Integer id;
    @ApiModelProperty(value = "wx_rule.id, 规则ID")
    private Integer rid;
    @ApiModelProperty(value = "回复文本内容")
    private String  content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
