package com.moseeker.vo.company.response;

import com.moseeker.util.StringUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.elasticsearch.common.geo.GeoPoint;

@Data
public class CompanyAddressDataVO {
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

    @ApiModelProperty("经度")
    private String longitude;

    @ApiModelProperty("纬度")
    private String latitude;

    @ApiModelProperty("地理位置")
    private GeoPoint point;
}
