package ua.com.golubov.algo.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.medium.CoinChangeService;

import static org.junit.Assert.*;

public class CoinChangeServiceTest {

    @Test
    public void testCoinChange() {
        int[] coins = new int[]{2, 5, 3, 6};
        assertEquals(5L, new CoinChangeService().change(10, coins));
    }

    @Test
    public void testCoinChange2() {
        int[] coins = new int[]{1, 2, 3};
        assertEquals(4L, new CoinChangeService().change(4, coins));
    }

}