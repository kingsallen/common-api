package com.moseeker.vo.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by moseeker on 2018/9/19.
 */
public enum HrPermissionType {
    FREE_COMPANY(0, "该公司为免费客户"), HR_NOTIN_COMPANY(1, "该Hr不属于该公司"),
    NOT_OPEN_TALENTPOOL_ORDINARY(2, "该公司未开启人才库功能"),
    OPEN_TALENTPOOL_ORDINARY(10, "该公司只开启人才库功能且账号类型为普通账号"),
    OPEN_TALENTPOOL_SUBACCOUNT(11, "该公司只开启人才库功能且账号类型为子账号"),
    OPEN_TALENTPOOL_SUPERACCOUNT(12, "该公司只开启人才库功能且账号类型为超级账号"),
    OPEN_AI_TALENTPOOL(20, "该公司开启智能人才库功能且账号类型为普通账号"),
    OPEN_AI_TALENTPOOL_SUBACCOUNT(21, "该公司开启智能人才库功能且账号类型为子账号"),
    OPEN_AI_TALENTPOOL_SUPERACCOUNT(22, "该公司开启智能人才库功能且账号类型为超级账号"),;

    private static Map<Integer, HrPermissionType> map = new HashMap<>();

    static {
        for (HrPermissionType csat : values()) {
            map.put(csat.getCode(), csat);
        }
    }


    HrPermissionType(int code, String message){

        this.code = code;
        this.message = message;
    }

    int code;
    String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HrPermissionType instanceFromByte(Integer value) {
        if (value != null && map.get(value.intValue()) != null) {
            return map.get(value.intValue());
        } else {
            return HrPermissionType.FREE_COMPANY;
        }
    }



}
