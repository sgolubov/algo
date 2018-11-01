package ua.com.golubov.algo.klarna.test;

import org.junit.Test;
import ua.com.golubov.algo.klarna.One;

import static org.junit.Assert.assertEquals;

public class OneTest {

    @Test
    public void maskifyTest1() {
        String res = One.maskify("4556364607935616");
        assertEquals("4###########5616", res);
    }

    @Test
    public void maskifyTest2() {
        String res = One.maskify("4556-3646-0793-5616");
        assertEquals("4###-####-####-5616", res);
    }

    @Test
    public void maskifyTest3() {
        String res = One.maskify("64607935616");
        assertEquals("6######5616", res);
    }

    @Test
    public void maskifyTest4() {
        String res = One.maskify("ABCD-EFGH-IJKLM-NOPQ");
        assertEquals("ABCD-EFGH-IJKLM-NOPQ", res);
    }

    @Test
    public void maskifyTest5() {
        String res = One.maskify("A1234567BCDEFG89HI");
        assertEquals("A#######BCDEFG89HI", res);
    }

    @Test
    public void maskifyTest6() {
        String res = One.maskify("12345");
        assertEquals("12345", res);
    }

    @Test
    public void maskifyTest7() {
        String res = One.maskify("");
        assertEquals("", res);
    }

}