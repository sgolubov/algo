package ua.com.golubov.algo.exam.test;

import org.junit.Test;
import ua.com.golubov.algo.exam.GlovoService;

import static org.junit.Assert.assertEquals;

public class GlovoServiceTest {

    private GlovoService underTest = new GlovoService();

    @Test
    public void test1() {
        assertEquals(10, underTest.solution(5, 3));
    }

    @Test
    public void test2() {
        assertEquals(-1, underTest.solution(40, 20));
    }

    @Test
    public void test3() {
        assertEquals(-1, underTest.solution(3, 5));
    }

    @Test
    public void test4() {
        //A[0][0] = 5    A[0][1] = 4    A[0][2] = 4
        //A[1][0] = 4    A[1][1] = 3    A[1][2] = 4
        //A[2][0] = 3    A[2][1] = 2    A[2][2] = 4
        //A[3][0] = 2    A[3][1] = 2    A[3][2] = 2
        //A[4][0] = 3    A[4][1] = 3    A[4][2] = 4
        //A[5][0] = 1    A[5][1] = 4    A[5][2] = 4
        //A[6][0] = 4    A[6][1] = 1    A[6][2] = 1
        assertEquals(11, underTest.solution(new int[][]{
                {5, 4, 4},
                {4, 3, 4},
                {3, 2, 4},
                {2, 2, 2},
                {3, 3, 4},
                {1, 4, 4},
                {4, 1, 1}
        }));
    }


}
