package ua.com.golubov.algo.exam.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.exam.CrossoverService;

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

    @Test
    public void testCase4() {
        Assert.assertArrayEquals(new String[]{"Yes", "No"}, CrossoverService.twins(new String[]{"cdab", "dcba"}, new String[]{"abcd", "abcd"}));
    }


}