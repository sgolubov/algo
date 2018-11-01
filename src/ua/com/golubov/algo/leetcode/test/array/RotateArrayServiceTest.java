package ua.com.golubov.algo.leetcode.test.array;

import org.junit.Assert;
import org.junit.Test;
import ua.com.golubov.algo.leetcode.array.RotateArrayService;

public class RotateArrayServiceTest {

    @Test
    public void shouldRotateArrayByKElementsOne() {
        RotateArrayService service = new RotateArrayService();

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        service.rotate(array, 3);

        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, array);
    }

    @Test
    public void shouldRotateArrayByKElementsTwo() {
        RotateArrayService service = new RotateArrayService();

        int[] array = new int[]{-1, -100, 3, 99};

        service.rotate(array, 2);

        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, array);
    }

    @Test
    public void shouldNotRotateArrayAtAll() {
        RotateArrayService service = new RotateArrayService();

        int[] array = new int[]{-1, -100, 3, 99};

        service.rotate(array, 16);

        Assert.assertArrayEquals(new int[]{-1, -100, 3, 99}, array);
    }

}