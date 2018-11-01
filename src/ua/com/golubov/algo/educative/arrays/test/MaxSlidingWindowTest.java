package ua.com.golubov.algo.educative.arrays.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.arrays.MaxSlidingWindow;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MaxSlidingWindowTest {

    @Test
    public void shouldCalculateValuesForWindow1() {
        int[] array = new int[]{20, 11, 9, 21, 11, 13, 14, 21, 90};
        List<Integer> result = MaxSlidingWindow.findMaxSlidingWindow(array, 3);
        assertArrayEquals(new int[]{20, 21, 21, 21, 14, 21, 90}, convertToArray(result));
    }

    @Test
    public void shouldCalculateValuesForWindow2() {
        int[] array = new int[]{1, 3, 2, 4, 6, 5, 7, 8, 13, 18, 11};
        List<Integer> result = MaxSlidingWindow.findMaxSlidingWindow(array, 5);
        assertArrayEquals(new int[]{6, 6, 7, 8, 13, 18, 18}, convertToArray(result));
    }

    @Test
    public void shouldCalculateValuesForWindow3() {
        int[] array = new int[]{1, 3, 2, 4, 6, 5, 7, 8, 13, 18, 11};
        List<Integer> result = MaxSlidingWindow.findMaxSlidingWindow(array, 3);
        assertArrayEquals(new int[]{3, 4, 6, 6, 7, 8, 13, 18, 18}, convertToArray(result));
    }

    @Test
    public void shouldReturnInputList() {
        int[] array = new int[]{1, 3, 2, 4, 6, 5, 7, 8, 13, 18, 11};
        List<Integer> result = MaxSlidingWindow.findMaxSlidingWindow(array, 1);
        assertArrayEquals(array, convertToArray(result));
    }

    @Test
    public void shouldReturnEmptyList() {
        int[] array = new int[]{1, 3, 2, 4, 6, 5, 7, 8, 13, 18, 11};
        List<Integer> result = MaxSlidingWindow.findMaxSlidingWindow(array, 0);
        assertEquals(0, result.size());
    }

    private int[] convertToArray(List<Integer> result) {
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }


}