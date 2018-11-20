package ua.com.golubov.algo.educative.string.test;

import org.junit.Test;
import ua.com.golubov.algo.educative.string.StringSegmentation;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class StringSegmentationTest {

    @Test
    public void shouldSegmentString() {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("hel");
        dictionary.add("hello");
        dictionary.add("on");
        dictionary.add("now");
        boolean result = StringSegmentation.canSegmentString(dictionary, "hellonow");
        assertTrue(result);
    }

}