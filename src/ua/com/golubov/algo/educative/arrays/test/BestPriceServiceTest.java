package ua.com.golubov.algo.educative.arrays.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.arrays.BestPriceService;

import static org.junit.Assert.assertEquals;

public class BestPriceServiceTest {

    @Test
    public void shouldFindBestIncome() {
        int res = BestPriceService.findBestIncome(new int[]{5, 4, 1, 8, 9, 1, 3, 5, 6, 20});
        assertEquals(19, res);
    }

    @Test
    public void shouldFindBestIncome2() {
        int res = BestPriceService.findBestIncome(new int[]{20, 18, 19, 15, 10, 5, 1});
        assertEquals(1, res);
    }

    @Test
    public void shouldFindBestIncome3() {
        int res = BestPriceService.findBestIncome(new int[]{20, 19, 18, 15, 10, 5, 1});
        assertEquals(-1, res);
    }

}