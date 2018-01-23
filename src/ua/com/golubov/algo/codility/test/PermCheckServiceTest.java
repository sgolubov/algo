package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.PermCheckService;

import static org.junit.Assert.assertEquals;

public class PermCheckServiceTest {

    @Test
    public void testCase() {
        assertEquals(1, new PermCheckService().solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new PermCheckService().solution(new int[]{4, 1, 3}));
    }

}