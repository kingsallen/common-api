package com.moseeker.vo.jobboard;

import lombok.Data;

import java.sql.Timestamp;

/**
 * UserThirdpartyUserVO
 *
 * @Author: lee
 * @Date: 2018/12/7
 */
@Data
public class UserThirdpartyUserVO {

    private Long id;
    private Integer userId;
    private Integer sourceId;
    private String username;
    private String password;
    private Timestamp createTime;
    private Timestamp updateTime;
}
