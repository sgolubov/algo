package ua.com.golubov.algo.exam.test;

import org.junit.Test;
import ua.com.golubov.algo.exam.GoogleService;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GoogleServiceTest {

    public GoogleService underTest = new GoogleService();

    @Test
    public void test1() {
        assertEquals(List.of(List.of("yell"), List.of("cat", "bzs"), List.of("catch"), List.of("abbc", "bccd", "zaab")),
                underTest.groupForEncoding(List.of("abbc", "bccd", "cat", "zaab", "yell", "bzs", "catch")));
    }

}
