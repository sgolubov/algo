package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.ArrayRotationService;

import static org.junit.Assert.*;


public class ArrayRotationServiceTest {

    private ArrayRotationService arrayRotationService = new ArrayRotationService();

    @Test
    public void arrayRotationTest() {
        int[] array = new int[]{3, 8, 9, 7, 6};
        int k = 3;
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest2() {
        int[] array = new int[]{0, 0, 0};
        int k = 1;
        assertArrayEquals(new int[]{0, 0, 0}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest3() {
        int[] array = new int[]{1, 2, 3, 4};
        int k = 4;
        assertArrayEquals(new int[]{1, 2, 3, 4}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest4() {
        int[] array = new int[]{1000};
        int k = 4;
        assertArrayEquals(new int[]{1000}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest5() {
        int[] array = new int[]{3, 8, 9, 7, 6};
        int k = 10;
        assertArrayEquals(new int[]{3, 8, 9, 7, 6}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest6() {
        int[] array = new int[]{3, 8, 9, 7, 6};
        int k = 11;
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, arrayRotationService.solution(array, k));
    }

    @Test
    public void arrayRotationTest7() {
        int[] array = new int[]{};
        int k = 11;
        assertArrayEquals(new int[]{}, arrayRotationService.solution(array, k));
    }

}