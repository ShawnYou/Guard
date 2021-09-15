package com.guard.config;

import lombok.Data;

/**
 * @version 1.0 created by youshuanglin on 2021/9/15 11:19 下午
 */
@Data
public class RateLimitConfig {
    private String name;
    private String maxQps;
}
