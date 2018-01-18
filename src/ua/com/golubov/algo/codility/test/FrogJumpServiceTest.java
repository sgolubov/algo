package ua.com.golubov.algo.codility.test;

import org.junit.Test;
import ua.com.golubov.algo.codility.FrogJumpService;

import static org.junit.Assert.*;

public class FrogJumpServiceTest {

    @Test
    public void testJump() {
        int X = 10;
        int Y = 85;
        int D = 30;
        assertEquals(3, new FrogJumpService().solution(X, Y, D));
    }

    @Test
    public void testJump2() {
        int X = 5;
        int Y = 30;
        int D = 6;
        assertEquals(5, new FrogJumpService().solution(X, Y, D));
    }

    @Test
    public void testJump3() {
        int X = 1;
        int Y = 1_000_000_000;
        int D = 5;
        assertEquals(200_000_000, new FrogJumpService().solution(X, Y, D));
    }

    @Test
    public void testJump4() {
        int X = 10;
        int Y = 10;
        int D = 5;
        assertEquals(0, new FrogJumpService().solution(X, Y, D));
    }

}