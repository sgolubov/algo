package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.DiffSummService;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class DiffSummServiceTest {

    @Test
    public void testCase4() {
        assertEquals(Arrays.asList(1, 3), DiffSummService.solve(4));
    }

    @Test
    public void testCase2() {
        assertEquals(Collections.singletonList(2), DiffSummService.solve(2));
    }

    @Test
    public void testCase5() {
        assertEquals(Arrays.asList(1, 4), DiffSummService.solve(5));
    }

    @Test
    public void testCase6() {
        assertEquals(Arrays.asList(1, 2, 3), DiffSummService.solve(6));
    }

    @Test
    public void testCase7() {
        assertEquals(Arrays.asList(1, 2, 4), DiffSummService.solve(7));
    }


}