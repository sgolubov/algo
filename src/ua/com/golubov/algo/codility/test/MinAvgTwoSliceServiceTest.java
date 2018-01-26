package ua.com.golubov.algo.codility.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.codility.MinAvgTwoSliceService;

public class MinAvgTwoSliceServiceTest {

    @Test
    public void testCase() {
        Assert.assertEquals(1, new MinAvgTwoSliceService().solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
        Assert.assertEquals(1, new MinAvgTwoSliceService().naiveSolution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(2, new MinAvgTwoSliceService().solution(new int[]{5, 6, 3, 4, 9}));
        Assert.assertEquals(2, new MinAvgTwoSliceService().naiveSolution(new int[]{5, 6, 3, 4, 9}));
    }

}