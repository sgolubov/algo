package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.CountDivService;

import static org.junit.Assert.assertEquals;

public class CountDivServiceTest {

    @Test
    public void testCase() {
        assertEquals(3, new CountDivService().naiveSolution(6, 11, 2));
    }


}