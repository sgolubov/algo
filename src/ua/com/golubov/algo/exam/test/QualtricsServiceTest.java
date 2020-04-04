package ua.com.golubov.algo.exam.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.exam.QualtricsService;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class QualtricsServiceTest {

    @Test
    public void test1() {
        Assert.assertEquals(List.of(1, 3, 4, 2, 2), QualtricsService.itemsSort(List.of(3, 1, 2, 2, 4)));
    }

    @Test
    public void test2() {
        assertEquals(List.of(8, 4, 4, 1, 1, 1, 5, 5, 5, 5),
                QualtricsService.itemsSort(List.of(8, 5, 5, 5, 5, 1, 1, 1, 4, 4)));
    }

    @Test
    public void test3() {
        assertEquals(20, QualtricsService.subarraySum(List.of(1, 2, 3)));
    }

    @Test
    public void test3_1() {
        assertEquals(10, QualtricsService.subarraySum(List.of(1, 1, 1)));
    }

    @Test
    public void test4() {
        assertEquals(4, QualtricsService.prison(3, 3, List.of(2), List.of(2)));
    }

    @Test
    public void test5() {
        assertEquals(4, QualtricsService.prison(2, 2, List.of(1), List.of(2)));
    }

    @Test
    public void test6() {
        assertEquals(12, QualtricsService.prison(3, 2, List.of(1, 2, 3), List.of(1, 2)));
    }

}
