package com.moseeker.vo.company.basic;

import java.util.HashMap;
import java.util.Map;

public enum HRRoleTypeEnum {

    SUPERADMIN(1, "超级管理员"),
    ADMIN(2, "管理员"),
    HR(3, "HR"),
    SENIORMANAGER(4, "高级用人经理"),
    MANAGER(5, "用人经理"),
    INTERVIEWER(6, "面试官")
    ;

    private HRRoleTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    private static Map<Integer, HRRoleTypeEnum> storage = new HashMap<>();

    static {
        for (HRRoleTypeEnum roleType : HRRoleTypeEnum.values()) {
            storage.put(roleType.getType(), roleType);
        }
    }

    private int type;
    private String name;

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static HRRoleTypeEnum initFromType(Integer roleType) {
        if(roleType != null) {
            HRRoleTypeEnum type = storage.get(roleType);
            if(type==null){
                type = HRRoleTypeEnum.HR;
            }
            return type;
        }
        return HRRoleTypeEnum.HR;
    }

    public static Boolean canLoginPC(Integer roleType){
        return !roleType.equals(HRRoleTypeEnum.MANAGER.getType())&&!roleType.equals(HRRoleTypeEnum.INTERVIEWER.getType());
    }
}
