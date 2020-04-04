package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.WordLadder;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderTest {

    private WordLadder underTest = new WordLadder();

    @Test
    public void test1() {
        assertEquals(5, underTest.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    public void test2() {
        assertEquals(0, underTest.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }


}
