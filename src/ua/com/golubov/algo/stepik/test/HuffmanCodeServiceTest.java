package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.HuffmanCodeService;

import static org.junit.Assert.*;

public class HuffmanCodeServiceTest {

    @Test
    public void testCase1() {
        assertEquals("0", HuffmanCodeService.encode("a"));
    }

    @Test
    public void testCase2() {
        assertEquals("01001100100111", HuffmanCodeService.encode("abacabad"));
    }

    @Test
    public void testCase3() {
        assertEquals("000000", HuffmanCodeService.encode("aaaaaa"));
    }

}