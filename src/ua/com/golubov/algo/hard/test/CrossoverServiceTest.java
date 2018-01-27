package ua.com.golubov.algo.hard.test;

import org.junit.Test;
import ua.com.golubov.algo.hard.CrossoverService;

import static org.junit.Assert.assertArrayEquals;

public class CrossoverServiceTest {

    @Test
    public void testCase() {
        assertArrayEquals(new int[]{1, 0}, CrossoverService.balancedOrNot(new String[]{"<>>>", "<>>>>"}, new int[]{2, 2}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{1, 0}, CrossoverService.balancedOrNot(new String[]{"<>", "<>><"}, new int[]{2, 1}));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{1, 0}, CrossoverService.balancedOrNot(new String[]{"<>", "<>><"}, new int[]{2, 1}));
    }


}