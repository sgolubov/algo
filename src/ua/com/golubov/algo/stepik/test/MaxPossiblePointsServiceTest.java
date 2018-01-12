package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.MaxPossiblePointsService;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class MaxPossiblePointsServiceTest {

    @Test
    public void testCase1() {
        int[][] arr = {{1, 3}, {2, 5}, {3, 6}};
        assertEquals(Collections.singletonList(3), MaxPossiblePointsService.solve(arr));
    }

    @Test
    public void testCase2() {
        int[][] arr = {{4, 7}, {1, 3}, {2, 5}, {5, 6}};
        assertEquals(Arrays.asList(3, 6), MaxPossiblePointsService.solve(arr));
    }


}