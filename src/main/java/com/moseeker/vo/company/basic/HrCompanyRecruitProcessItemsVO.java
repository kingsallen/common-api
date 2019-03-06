package com.moseeker.vo.company.basic;/**
 * Created by zztaiwll on 19/3/5.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @version 1.0
 * @className HrCompanyRecruitProcessItemsVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/3/5 下午2:09
 **/
@Data
@ApiModel("招聘进度招聘状态关联的数据模型")
public class HrCompanyRecruitProcessItemsVO {
    @ApiModelProperty(name="id",value = "主键编号",required = true)
    private Integer   id;
    @ApiModelProperty(name="parentId",value = "hr_company_recruit_process.id",required = true)
    private Integer   parentId;
    @ApiModelProperty(name="disable",value = "状态 0 有效 1无效",required = true)
    private Integer   disable;
    @ApiModelProperty(name="processOrder",value = "顺序",required = true)
    private Integer   processOrder;
    @ApiModelProperty(name="appTplId",value = "关联config_sys_points_conf_tpl.id",required = true)
    private Integer   appTplId;
    @ApiModelProperty(name="createTime",value = "创建时间",required = true)
    private Timestamp createTime;
    @ApiModelProperty(name="updateTime",value = "更新时间",required = true)
    private Timestamp updateTime;
}
