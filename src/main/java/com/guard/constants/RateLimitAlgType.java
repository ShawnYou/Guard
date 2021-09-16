package com.guard.constants;

/**
 * @version 1.0 created by youshuanglin on 2021/9/16 10:09 下午
 */
public enum RateLimitAlgType {
    FIXED_TIME_WINDOWS("固定时间窗口", 1);

    private String  name;
    private Integer code;

    RateLimitAlgType(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
