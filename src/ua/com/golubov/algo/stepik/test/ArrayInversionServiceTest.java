package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.ArrayInversionService;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayInversionServiceTest {

    @Test
    public void testNaiveAlgo() {
        assertEquals(2, ArrayInversionService.countInversionsNaive(new int[]{2, 3, 9, 2, 9}));
    }

    @Test
    public void testMergeSortAlgo() {
        AtomicInteger counter = new AtomicInteger(0);
        int[] sorted = ArrayInversionService.mergeSortWithCounter(new int[]{2, 3, 9, 2, 9}, 0, 4, counter);
        assertArrayEquals(new int[]{2, 2, 3, 9, 9}, sorted);
        assertEquals(2, counter.intValue());
    }

    @Test
    public void testMergeSortAlgoLargerDataSet() {
        AtomicInteger counter = new AtomicInteger(0);
        int[] sorted = ArrayInversionService.mergeSortWithCounter(new int[]{2, 3, 9, 2, 9, 1, 4, 5, 6, 7, -1}, 0, 10, counter);
        assertArrayEquals(new int[]{-1, 1, 2, 2, 3, 4, 5, 6, 7, 9, 9}, sorted);
        assertEquals(25, counter.intValue());
    }


}