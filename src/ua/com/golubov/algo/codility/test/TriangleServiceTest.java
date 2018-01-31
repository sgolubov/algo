package ua.com.golubov.algo.codility.test;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.codility.TriangleService;

public class TriangleServiceTest {

    @Test
    public void solution_correctInput_returnsTrue() {
        Assert.assertEquals(1, new TriangleService().solution(new int[]{10, 2, 5, 1, 8, 20}));
    }

    @Test
    public void solution_correctInput_returnsFalse() {
        Assert.assertEquals(0, new TriangleService().solution(new int[]{10, 50, 5, 1}));
    }

}