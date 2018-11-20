package ua.com.golubov.algo.educative.arrays.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.arrays.QuickSort;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void shouldSort() {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, array);
    }

    @Test
    public void shouldSort2() {
        int[] array = new int[]{13, 1, 12, 2, 11, 3, 10, 4, 9, 5, 8, 6, 7, -1};
        QuickSort.quickSort(array);
        assertArrayEquals(new int[]{-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, array);
    }

}