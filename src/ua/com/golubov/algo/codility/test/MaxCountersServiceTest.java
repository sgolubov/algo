package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.MaxCountersService;

import static org.junit.Assert.assertArrayEquals;

public class MaxCountersServiceTest {

    @Test
    public void testCase() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, new MaxCountersService().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

}