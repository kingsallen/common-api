package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Description TODO
 * @Author Rays
 * @DATE 2019-10-11
 **/
@ApiModel("公司地址数据模型")
@Data
public class PositionAddressVO implements Serializable {

    private static final long serialVersionUID = -632782996613542752L;

    @ApiModelProperty("自增主键")
    private Integer   id;

    @ApiModelProperty("地址名称")
    private String    addressName;

    @ApiModelProperty("公司id")
    private Integer   companyId;

    @ApiModelProperty("省份编码")
    private Integer   province;

    @ApiModelProperty("城市编号")
    private Integer   city;

    @ApiModelProperty("区县编号")
    private Integer   region;

    @ApiModelProperty("详细地址")
    private String    address;

    @ApiModelProperty("部门id")
    private Integer   departmentId;

    @ApiModelProperty("部门名称")
    private String departmentName;

    @ApiModelProperty("创建时间")
    private Timestamp createTime;

    @ApiModelProperty("修改时间")
    private Timestamp updateTime;

    @ApiModelProperty("经度")
    private String longitude;

    @ApiModelProperty("纬度")
    private String latitude;

}
