package ua.com.golubov.algo.exam.test;

import org.junit.Test;
import ua.com.golubov.algo.exam.CodilityNokiaService;

import static org.junit.Assert.assertEquals;

public class CodilityNokiaServiceTest {

    @Test
    public void testCase() {
        assertEquals(11, new CodilityNokiaService().solution(9736));
        assertEquals(11, new CodilityNokiaService().solution(9736));
    }

    @Test
    public void testCase2() {
    }

    @Test
    public void testCase3() {
        assertEquals(0, new CodilityNokiaService().solution(1_000_000_000, 1_000_000_000, 1_000_000_000));
        assertEquals(0, new CodilityNokiaService().solution(0, 100, 1_000_000_000));
        assertEquals(1, new CodilityNokiaService().solution(100, 0, 99));
        assertEquals(1, new CodilityNokiaService().solution(1_000_000_001, 1_000_000_000, 1_000_000_000));
        assertEquals(1, new CodilityNokiaService().solution(3, 4, 8));
    }

}