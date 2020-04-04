package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.NumOfBurgers;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumOfBurgersTest {

    private NumOfBurgers numOfBurgers = new NumOfBurgers();

    @Test
    public void test1() {
        assertEquals(List.of(1, 6), numOfBurgers.numOfBurgers(16, 7));
    }

    @Test
    public void test2() {
        assertEquals(Collections.emptyList(), numOfBurgers.numOfBurgers(17, 4));
    }

    @Test
    public void test3() {
        assertEquals(Collections.emptyList(), numOfBurgers.numOfBurgers(4, 17));
    }

    @Test
    public void test4() {
        assertEquals(List.of(0, 0), numOfBurgers.numOfBurgers(0, 0));
    }

    @Test
    public void test5() {
        assertEquals(List.of(0, 1), numOfBurgers.numOfBurgers(2, 1));
    }

    @Test
    public void test6() {
        assertEquals(Collections.emptyList(), numOfBurgers.numOfBurgers(2385088, 164763));
    }


}
