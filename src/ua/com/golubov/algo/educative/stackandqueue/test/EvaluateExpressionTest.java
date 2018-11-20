package ua.com.golubov.algo.educative.stackandqueue.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.stackandqueue.EvaluateExpression;

import static org.junit.Assert.assertEquals;

public class EvaluateExpressionTest {

    @Test
    public void shouldEvaluate1() {
        assertEquals(23d, EvaluateExpression.evaluate("5 + 3 * 6"), 0.1);
    }

    @Test
    public void shouldEvaluate2() {
        assertEquals(10d, EvaluateExpression.evaluate("6 + 4 / 2 * 2"), 0.1);
    }

    @Test
    public void shouldEvaluate3() {
        assertEquals(3.30625, EvaluateExpression.evaluate("3 + 2.45 / 8"), 0.00001);
    }

    @Test
    public void shouldEvaluate4() {
        assertEquals(21d, EvaluateExpression.evaluate("5 * 3 + 6"), 0.1);
    }

}