package com.moseeker.vo.jooq.redis;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author cjm
 * @date 2018-08-31 11:11
 **/
@Data
@ToString
@ApiModel
public class RedisVO {
    @ApiModelProperty(name = "appId", value = "项目号", dataType = "Long")
    private Integer appId;
    @ApiModelProperty(name = "keyIdentifier", value = "key修饰符", dataType = "string")
    private String keyIdentifier;
    @ApiModelProperty(name = "str", value = "key_pattern中的第一个%s", dataType = "string")
    private String str;
    @ApiModelProperty(name = "str1", value = "key_pattern中的第二个%s", dataType = "string")
    private String str1;
    @ApiModelProperty(name = "value", value = "value", dataType = "string")
    private String value;

    public RedisVO(Integer appId, String keyIdentifier, String str, String str1, String value) {
        this.appId = appId;
        this.keyIdentifier = keyIdentifier;
        this.str = str;
        this.str1 = str1;
        this.value = value;
    }

    public RedisVO(Integer appId, String keyIdentifier, String str, String value) {
        this.appId = appId;
        this.keyIdentifier = keyIdentifier;
        this.str = str;
        this.value = value;
    }

    public RedisVO() {
    }
}
