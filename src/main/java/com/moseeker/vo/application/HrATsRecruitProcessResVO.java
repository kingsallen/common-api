package com.moseeker.vo.application;

        import io.swagger.annotations.ApiModel;
        import io.swagger.annotations.ApiModelProperty;
        import lombok.Data;

        import java.util.List;

@Data
@ApiModel("招聘修改返回结果")
public class HrATsRecruitProcessResVO {
    @ApiModelProperty(name="successData",value = "执行成功的申请进度变化列表",dataType = "java.util")
    private List<Integer> successData;
    @ApiModelProperty(name="errorData",value = "执行失败的申请进度变化列表",dataType = "java.util")
    private List<Integer> errorData;
}
