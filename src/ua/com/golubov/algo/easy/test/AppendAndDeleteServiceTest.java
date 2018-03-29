package ua.com.golubov.algo.easy.test;

import org.junit.Test;
import ua.com.golubov.algo.easy.AppendAndDeleteService;

import static org.junit.Assert.*;

public class AppendAndDeleteServiceTest {

    @Test
    public void test() {
        AppendAndDeleteService service = new AppendAndDeleteService();
        assertEquals("Yes", service.appendAndDelete("hackerhappy", "hackerrank", 9));
        assertEquals("Yes", service.appendAndDelete("aba", "aba", 7));
        assertEquals("No", service.appendAndDelete("ashley", "ash", 2));
        assertEquals("No", service.appendAndDelete("qwerasdf", "qwerbsdf", 6));
        assertEquals("Yes", service.appendAndDelete("abcd", "abcdert", 10));
        assertEquals("Yes", service.appendAndDelete("y", "yu", 2));
    }


}