package ua.com.golubov.algo.educative.arrays.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.arrays.BinarySearch;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void shouldFindKey() {
        int idx = BinarySearch.binSearchIterative(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11}, 3);
        int idx2 = BinarySearch.binSearchRecursive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11}, 3);
        assertEquals(2, idx);
        assertEquals(2, idx2);
    }

    @Test
    public void shouldFindKey2() {
        int idx = BinarySearch.binSearchIterative(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12);
        int idx2 = BinarySearch.binSearchRecursive(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12);
        assertEquals(5, idx);
        assertEquals(5, idx2);
    }

    @Test
    public void shouldFindKey3() {
        int idx = BinarySearch.binSearchIterative(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 80);
        int idx2 = BinarySearch.binSearchRecursive(new int[]{1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 80);
        assertEquals(11, idx);
        assertEquals(11, idx2);
    }

    @Test
    public void shouldNotFindKey() {
        int idx = BinarySearch.binSearchIterative(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11}, 20);
        int idx2 = BinarySearch.binSearchRecursive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 11}, 20);
        assertEquals(-1, idx2);
    }


}