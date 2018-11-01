package ua.com.golubov.algo.klarna.test;

import org.junit.Test;
import ua.com.golubov.algo.klarna.Two;

import static org.junit.Assert.assertEquals;

public class TwoTest {

    @Test
    public void numberToOrdinalTest1() {
        String res = Two.numberToOrdinal(1);
        assertEquals("1st", res);
    }

    @Test
    public void numberToOrdinalTest2() {
        String res = Two.numberToOrdinal(2);
        assertEquals("2nd", res);
    }

    @Test
    public void numberToOrdinalTest3() {
        String res = Two.numberToOrdinal(3);
        assertEquals("3rd", res);
    }

    @Test
    public void numberToOrdinalTest4() {
        String res = Two.numberToOrdinal(4);
        assertEquals("4th", res);
    }

    @Test
    public void numberToOrdinalTest5() {
        String res = Two.numberToOrdinal(21);
        assertEquals("21st", res);
    }

    @Test
    public void numberToOrdinalTest6() {
        String res = Two.numberToOrdinal(0);
        assertEquals("0", res);
    }

    @Test
    public void numberToOrdinalTest7() {
        String res = Two.numberToOrdinal(112);
        assertEquals("112th", res);
    }

    @Test
    public void numberToOrdinalTest8() {
        String res = Two.numberToOrdinal(33);
        assertEquals("33rd", res);
    }

    @Test
    public void numberToOrdinalTest9() {
        String res = Two.numberToOrdinal(92);
        assertEquals("92nd", res);
    }

}