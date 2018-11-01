package ua.com.golubov.algo.leetcode.test.array;

import org.junit.Test;
import ua.com.golubov.algo.leetcode.array.ContainsDuplicateService;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateServiceTest {

    @Test
    public void shouldReturnTrue() {
        ContainsDuplicateService service = new ContainsDuplicateService();

        boolean result = service.containsDuplicate(new int[]{1, 2, 3, 1});

        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueTwo() {
        ContainsDuplicateService service = new ContainsDuplicateService();

        boolean result = service.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse() {
        ContainsDuplicateService service = new ContainsDuplicateService();

        boolean result = service.containsDuplicate(new int[]{1, 2, 3, 4});

        assertFalse(result);
    }

}