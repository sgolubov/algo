package ua.com.golubov.algo.educative.arrays.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.arrays.BinarySearchRotated;

import static org.junit.Assert.assertEquals;

public class BinarySearchRotatedTest {

    @Test
    public void shouldFindKey() {
        int idx = BinarySearchRotated.binarySearchRotated(new int[]{5, 6, 7, 8, 10, 11, 1, 2, 3, 4}, 3);
        assertEquals(8, idx);
    }

    @Test
    public void shouldFindKey2() {
        int idx = BinarySearchRotated.binarySearchRotated(new int[]{50, 69, 80, 100, 1, 2, 4, 7, 8, 12, 15, 19, 24}, 12);
        assertEquals(9, idx);
    }

    @Test
    public void shouldFindKey3() {
        int idx = BinarySearchRotated.binarySearchRotated(new int[]{24, 50, 69, 80, 100, 1, 2, 4, 7, 8, 12, 15, 19}, 80);
        assertEquals(3, idx);
    }

    @Test
    public void shouldNotFindKey() {
        int idx = BinarySearchRotated.binarySearchRotated(new int[]{8, 10, 11, 1, 2, 3, 4, 5, 6, 7}, 20);
        assertEquals(-1, idx);
    }

}