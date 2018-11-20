package ua.com.golubov.algo.educative.dynamic.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.dynamic.FibonacciNumbers;

import static org.junit.Assert.assertEquals;

public class FibonacciNumbersTest {

    @Test
    public void shouldReturnCorrectNumber() {
        assertEquals(8, FibonacciNumbers.fib(6));
    }

    @Test
    public void shouldReturnCorrectNumber2() {
        assertEquals(13, FibonacciNumbers.fib(7));
    }

    @Test
    public void shouldReturnCorrectNumber3() {
        assertEquals(1, FibonacciNumbers.fib(2));
    }

    @Test
    public void shouldReturnCorrectNumber4() {
        assertEquals(99194853094755497L, FibonacciNumbers.fib(83));
    }

}