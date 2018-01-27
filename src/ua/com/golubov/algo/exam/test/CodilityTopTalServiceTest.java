package ua.com.golubov.algo.exam.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.exam.CodilityTopTalService;

import static org.junit.Assert.assertEquals;

public class CodilityTopTalServiceTest {

    @Test
    public void testCase1() {
        // TODO setup test Tree
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(12, new CodilityTopTalService().solution(1213));
        assertEquals(6, new CodilityTopTalService().solution(123));
        assertEquals(1, new CodilityTopTalService().solution(100));
    }

    @Test
    public void testCase3() {
        assertEquals(4, new CodilityTopTalService().solution("abbabba"));
        assertEquals(0, new CodilityTopTalService().solution("codility"));
    }

}