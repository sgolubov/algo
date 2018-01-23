package ua.com.golubov.algo.codility.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.codility.MissingIntegerService;

public class MissingIntegerServiceTest {

    @Test
    public void testCase() {
        Assert.assertEquals(5, new MissingIntegerService().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(4, new MissingIntegerService().solution(new int[]{1, 2, 3}));
    }

    @Test
    public void testCase3() {
        Assert.assertEquals(1, new MissingIntegerService().solution(new int[]{-1, -3}));
    }

}