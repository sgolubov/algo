package ua.com.golubov.algo.codility.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.codility.TapeEquilibriumService;

public class TapeEquilibriumServiceTest {

    @Test
    public void testCase() {
        int[] array = new int[]{3, 1, 2, 4, 3};
        Assert.assertEquals(1, new TapeEquilibriumService().solution(array));
    }

    @Test
    public void testCase1() {
        int[] array = new int[]{-3, -1, -2, -4, -3};
        Assert.assertEquals(1, new TapeEquilibriumService().solution(array));
    }

    @Test
    public void testCase2() {
        int[] array = new int[]{3, 1};
        Assert.assertEquals(2, new TapeEquilibriumService().solution(array));
    }

    @Test
    public void testCase3() {
        int[] array = new int[]{3, 3};
        Assert.assertEquals(0, new TapeEquilibriumService().solution(array));
    }


}