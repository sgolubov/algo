package ua.com.golubov.algo.leetcode.test.array;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.array.RemoveDuplicatesService;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesServiceTest {

    @Test
    public void shouldReturnCorrectNumberOfElementsOne() {
        RemoveDuplicatesService service = new RemoveDuplicatesService();

        int result = service.removeDuplicates(new int[]{1, 1, 2});

        assertEquals(2, result);
    }

    @Test
    public void shouldReturnCorrectNumberOfElementsTwo() {
        RemoveDuplicatesService service = new RemoveDuplicatesService();

        int result = service.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        assertEquals(5, result);
    }

    @Test
    public void shouldReturnSizeForSmallOrEmptyArray() {
        RemoveDuplicatesService service = new RemoveDuplicatesService();

        int one = service.removeDuplicates(new int[]{0});
        int empty = service.removeDuplicates(new int[]{});

        assertEquals(1, one);
        assertEquals(0, empty);
    }


}