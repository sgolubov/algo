package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.PermMissingElemService;

import static org.junit.Assert.*;

public class PermMissingElemServiceTest {

    @Test
    public void testMissingElement() {
        int[] array = new int[]{2, 3, 1, 5};
        assertEquals(4, new PermMissingElemService().solution(array));
    }

    @Test
    public void testMissingElementOne() {
        int[] array = new int[]{1};
        assertEquals(2, new PermMissingElemService().solution(array));
    }

    @Test
    public void testMissingElementOne2() {
        int[] array = new int[]{2};
        assertEquals(1, new PermMissingElemService().solution(array));
    }

}