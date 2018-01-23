package ua.com.golubov.algo.codility.test;

import org.junit.Ignore;
import org.junit.Test;
import ua.com.golubov.algo.codility.FrogRiverOneService;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneServiceTest {

    @Test
    public void testCase() {
        assertEquals(6, new FrogRiverOneService().solution(5, new int[]{1, 4, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new FrogRiverOneService().solution(7, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    @Ignore
    public void testCase3() {
        assertEquals(0, new FrogRiverOneService().solution(1, new int[]{1}));
    }

}