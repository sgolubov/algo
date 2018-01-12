package ua.com.golubov.algo.easy.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.easy.BonAppetitService;


public class BonAppetitServiceTest {

    @Test
    public void solveDiff() throws Exception {
        Assert.assertEquals(5, BonAppetitService.solve(4, 1, 12, new int[]{3, 10, 2, 9}));
    }

    @Test
    public void solveOk() throws Exception {
        Assert.assertEquals(0, BonAppetitService.solve(4, 1, 7, new int[]{3, 10, 2, 9}));
    }

}