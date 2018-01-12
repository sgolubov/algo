package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.HuffmanDecodeService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HuffmanDecodeServiceTest {

    @Test
    public void testDictionaryBuild() {
        assertEquals(Collections.singletonMap("0", "a"), HuffmanDecodeService.buildDictionary(Collections.singletonList("a: 0")));
    }

    @Test
    public void testDecode1() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("0", "a");
        dictionary.put("10", "b");
        dictionary.put("110", "c");
        dictionary.put("111", "d");
        assertEquals("abacabad", HuffmanDecodeService.decode("01001100100111", dictionary));
    }

    @Test
    public void testDecode2() {
        assertEquals("a", HuffmanDecodeService.decode("0", Collections.singletonMap("0", "a")));
    }

}