package edu.zhyuliuk.task;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {
    @Test
    public void isPositiveNumberTest() {
        boolean actual = Utils.isAllPositiveNumbers("12","43");
        assertTrue(actual);
    }
}
