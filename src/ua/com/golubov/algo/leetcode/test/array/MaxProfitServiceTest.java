package ua.com.golubov.algo.leetcode.test.array;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.array.MaxProfitService;

import static org.junit.Assert.assertEquals;

public class MaxProfitServiceTest {

    @Test
    public void shouldReturnCorrectMaxProfitOne() {
        MaxProfitService service = new MaxProfitService();

        int result = service.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        assertEquals(7, result);
    }

    @Test
    public void shouldReturnCorrectMaxProfitTwo() {
        MaxProfitService service = new MaxProfitService();

        int result = service.maxProfit(new int[]{1, 2, 3, 4, 5});

        assertEquals(4, result);
    }

    @Test
    public void shouldReturnCorrectMaxProfitThree() {
        MaxProfitService service = new MaxProfitService();

        int result = service.maxProfit(new int[]{7, 6, 4, 3, 1});

        assertEquals(0, result);
    }

}