package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.DynamicProgrammingService;

import static org.junit.Assert.assertEquals;

public class DynamicProgrammingServiceTest {

    @Test
    public void testLIS() {
        assertEquals(3, DynamicProgrammingService.lisBottomUp(new int[]{3, 6, 7, 12}).getAsInt());
    }

    @Test
    public void testLIS2() {
        assertEquals(6, DynamicProgrammingService.lisBottomUp(new int[]{3, 6, 9, 12, 24, 48, 96}).getAsInt());
    }

    @Test
    public void testLIS3() {
        assertEquals(6, DynamicProgrammingService.lisBottomUp(new int[]{1, 1, 1, 1, 1, 1}).getAsInt());
    }

}