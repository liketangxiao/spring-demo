package com.yooou.yj.enums;

import lombok.Data;

/**
 * @Description:
 * @Author: WangYuJ
 * @Date 2018/11/7
 */
public enum StatusEnum {
    FAIL("3000", "失败")/** 失败 */
    ,

    SUCCESS("2000", "成功")/** 成功 */
    ,

    VALIDATION_FAIL("4000", "校验失败")/** 校验失败 */
    ;

    /** 枚举值 */
    private String code;

    /** 枚举描述 */
    private String msg;

    /**
     * @Description: 构建一个StatusEnum
     * @Param [code, msg]
     */
    StatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
