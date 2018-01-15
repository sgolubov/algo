package ua.com.golubov.algo.stepik.test;

import org.junit.Test;
import ua.com.golubov.algo.stepik.QuickSortService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class QuickSortServiceTest {

    @Test
    public void testPointIntersection() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 1);
        result.put(6, 0);
        result.put(11, 0);
        assertEquals(result, QuickSortService.countPointIntersection(Arrays.asList(new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 2),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 3), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 0),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 5), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 7),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 10), new QuickSortService.Position(QuickSortService.Type.POINT, 1),
                new QuickSortService.Position(QuickSortService.Type.POINT, 6), new QuickSortService.Position(QuickSortService.Type.POINT, 11))));
    }

    @Test
    public void testPointIntersection2() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 2);
        result.put(2, 3);
        result.put(3, 6);
        result.put(4, 3);
        result.put(5, 2);
        result.put(6, 2);
        assertEquals(result, QuickSortService.countPointIntersection(Arrays.asList(new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 6),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 6), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 0),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 3), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 1),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 3), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 2),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 3), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 3),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 4), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 3),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 5), new QuickSortService.Position(QuickSortService.Type.LEFT_EDGE, 3),
                new QuickSortService.Position(QuickSortService.Type.RIGHT_EDGE, 6), new QuickSortService.Position(QuickSortService.Type.POINT, 1),
                new QuickSortService.Position(QuickSortService.Type.POINT, 2), new QuickSortService.Position(QuickSortService.Type.POINT, 3),
                new QuickSortService.Position(QuickSortService.Type.POINT, 4), new QuickSortService.Position(QuickSortService.Type.POINT, 5),
                new QuickSortService.Position(QuickSortService.Type.POINT, 6))));
    }

}