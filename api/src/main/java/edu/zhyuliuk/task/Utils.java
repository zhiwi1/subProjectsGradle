package edu.zhyuliuk.task;

import by.zhyuliuk.task.utils.StringUtils;

import java.util.Arrays;

public final class Utils {
    private Utils() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
