package com.guard.alg;

import com.guard.constants.RateLimitAlgType;

/**
 * @version 1.0 created by youshuanglin on 2021/9/16 10:07 下午
 */
public class RateLimitAlgManager {

    public RateLimitAlg getRateLimitAlg(RateLimitAlgType type) {
        if (type.equals(RateLimitAlgType.FIXED_TIME_WINDOWS)) {
            return new FixedTimePeriodRateLimitAlg();
        }
        return null;
    }
}
