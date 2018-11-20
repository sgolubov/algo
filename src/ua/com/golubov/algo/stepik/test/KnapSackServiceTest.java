package ua.com.golubov.algo.stepik.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.stepik.KnapSackService;

public class KnapSackServiceTest {

    @Test
    public void testCase1() {
        double[][] goods = {{60, 20}, {100, 50}, {120, 30}};
        Assert.assertEquals(180.000, KnapSackService.solve(goods, 50), 0.001);
    }

    @Test
    public void testCase2() {
        double[][] goods = {{100, 20}, {120, 40}};
        Assert.assertEquals(190.000, KnapSackService.solve(goods, 50), 0.001);
    }

}