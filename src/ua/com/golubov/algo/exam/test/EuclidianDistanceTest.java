package ua.com.golubov.algo.exam.test;

import org.junit.Test;
import ua.com.golubov.algo.exam.EuclidianDistance;

import static org.junit.Assert.assertArrayEquals;
import static ua.com.golubov.algo.exam.EuclidianDistance.Point;

public class EuclidianDistanceTest {

    private Point[] points = new Point[]{
            new Point(1, 1),
            new Point(2, 2),
            new Point(3, 3),
            new Point(4, 4),
            new Point(5, 5),
            new Point(6, 6)
    };

    @Test
    public void shouldReturnFirstKElements() {
        Point[] result = EuclidianDistance.getKNearestPoints(points, 2);
        assertArrayEquals(new Point[]{new Point(1, 1), new Point(2, 2)}, result);
    }

}