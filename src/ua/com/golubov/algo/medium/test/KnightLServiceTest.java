package ua.com.golubov.algo.medium.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.medium.KnightLService;

public class KnightLServiceTest {

    @Test
    public void calculate() throws Exception {
        int[][] expected = {{4, 4, 2, 8}, {4, 2, 4, 4}, {2, 4, -1, -1}, {8, 4, -1, 1}};
        Assert.assertArrayEquals(expected, KnightLService.calculate(5));
    }

}