package ua.com.golubov.algo.exam.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.exam.BnyService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BnyServiceTest {

    @Test
    public void test1() {
        Assert.assertEquals(6 , BnyService.minDiff(new ArrayList<>() {{
            add(1);
            add(3);
            add(3);
            add(5);
            add(5);
            add(7);
        }}));
    }

    @Test
    public void test2() {
        assertEquals(13, BnyService.fewestCoins("asdfkjeghfalawefhaef"));
    }

    @Test
    public void test3() {
        assertEquals(2, BnyService.fewestCoins("bab"));
    }

    @Test
    public void test3_1() {
        assertEquals(3, BnyService.fewestCoins("babccba"));
    }

    @Test
    public void test4() {
        assertEquals(4, BnyService.fewestCoins("dabbcabcd"));
    }

    @Test
    public void test5() {
        assertEquals(List.of(1, 0), BnyService.balancedOrNot(List.of("<>>>", "<>>>>"), List.of(2, 2)));
    }

}
