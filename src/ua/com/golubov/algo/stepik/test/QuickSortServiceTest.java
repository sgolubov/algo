package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.QuickSortService;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortServiceTest {

    @Test
    public void testPointIntersection() {
        assertArrayEquals(new int[]{1, 0, 0}, QuickSortService.countPointIntersection(new int[][]{{2, 3}, {0, 5}, {7, 10}}, new int[]{1, 6, 11}));
    }


}