package ua.com.golubov.algo.klarna.test;

import org.junit.Test;
import ua.com.golubov.algo.klarna.Three;

import static org.junit.Assert.assertEquals;

public class ThreeTest {

    @Test
    public void testEvaluate1() {
        double res = Three.evaluate("1 2 3.5");
        assertEquals(3.5, res, 0.001);
    }

    @Test
    public void testEvaluate2() {
        double res = Three.evaluate("10000 123 +");
        assertEquals(10123d, res, 0.001);
    }

    @Test
    public void testEvaluate3() {
        double res = Three.evaluate("5 1 2 + 4 * + 3 -");
        assertEquals(14d, res, 0.001);
    }

    @Test
    public void testEvaluate4() {
        double res = Three.evaluate("");
        assertEquals(0d, res, 0.001);
    }

}