package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "修改公司微信公众号主题色信息")
public class ConfigThemeReqVO {

    @ApiModelProperty(value = "公司编号", required = true)
    private Integer companyId;
    @ApiModelProperty(value = "微信主题色信息信息(用于 修改公司微信公众号主题色信息)")
    private List<ColorDataVO> dataList;
    @ApiModelProperty(value = "表示是否可以开启企业自定义颜色配置 0是否 1是开启 (用于 修改公司的自定义颜色配置开关接口)")
    private Integer status;


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public List<ColorDataVO> getDataList() {
        return dataList;
    }

    public void setDataList(List<ColorDataVO> dataList) {
        this.dataList = dataList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
