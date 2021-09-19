package edu.zhyuliuk.task;

import by.zhyuliuk.task.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        boolean result = true;
        int i = 0;
        while (i < str.length) {
            if (!StringUtils.isPositiveNumber(str[i])) {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
