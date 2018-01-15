package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.CountingSortService;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortServiceTest {

    @Test
    public void testCountingSort() {
        int[] array = new int[]{2, 3, 9, 2, 9};
        assertArrayEquals(new int[]{2, 2, 3, 9, 9}, CountingSortService.countingSort(array, 10));
    }


}