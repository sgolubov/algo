package ua.com.golubov.algo.educative.dynamic.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.dynamic.LargestSumSubArray;

import static org.junit.Assert.assertEquals;

public class LargestSumSubArrayTest {

    @Test
    public void shouldReturnLargestSumBetweenIdenticalElements() {
        long result = LargestSumSubArray.getLargestSumBetweenIdenticalElements(new int[]{-1, 2, 3, -1, -2, 10, 15, 12, -2});
        assertEquals(37, result);
    }

    @Test
    public void shouldReturnLargestSumBetweenIdenticalElements2() {
        long result = LargestSumSubArray.getLargestSumBetweenIdenticalElements(new int[]{10, 15, 16, 17, 18, 19, 20, 21});
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnLargestSumBetweenIdenticalElements3() {
        long result = LargestSumSubArray.getLargestSumBetweenIdenticalElements(new int[]{0, 2, 3, 0, 1, 1, 1, 1});
        assertEquals(5, result);
    }

}