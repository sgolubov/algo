package ua.com.golubov.algo.leetcode.medium.test;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.medium.MaxAreaOfAnIsland;

import static org.junit.Assert.assertEquals;

public class MaxAreaOfAnIslandTest {

    private MaxAreaOfAnIsland qualtrics = new MaxAreaOfAnIsland();

    @Test
    public void test1() {
        assertEquals(6, qualtrics.maxAreaOfIsland(new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        }));
    }

    @Test
    public void test2() {
        assertEquals(0, qualtrics.maxAreaOfIsland(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }));
    }

}
