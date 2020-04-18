package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.PalindromePartitioning;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalindromePartitioningTest {

    private PalindromePartitioning underTest = new PalindromePartitioning();

    @Test
    public void test1() {
        assertEquals(List.of(List.of("a", "a", "b"), List.of("aa", "b")), underTest.partition("aab"));
    }

    @Test
    public void test2() {

    }


}
