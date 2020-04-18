package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.MinimumDominoRotations;

import static org.junit.Assert.assertEquals;

public class MinimumDominoRotationsTest {

    private MinimumDominoRotations underTest = new MinimumDominoRotations();

    @Test
    public void test1() {
        assertEquals(2,
                underTest.minDominoRotations(new int[]{2, 1, 2, 4, 2, 2},
                        new int[]{5, 2, 6, 2, 3, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1,
                underTest.minDominoRotations(new int[]{1, 2, 2, 1, 2, 1, 2, 1, 2},
                        new int[]{1, 2, 1, 1, 1, 1, 2, 1, 2}));
    }

}
