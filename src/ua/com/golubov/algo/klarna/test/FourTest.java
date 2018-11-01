package ua.com.golubov.algo.klarna.test;

import org.junit.Test;
import ua.com.golubov.algo.klarna.Four;

import static org.junit.Assert.assertEquals;
import static ua.com.golubov.algo.klarna.Four.Point;

public class FourTest {

    private static final Point[] forrest = new Point[]{
            // <= 45 degrees
            new Point(1, 1),
            new Point(2, 1),
            new Point(3, 1),
            new Point(4, 1),
            new Point(5, 1),
            new Point(6, 1),
            new Point(7, 1),
            new Point(8, 1),
            // > 45 degrees
            new Point(1, 2),
            new Point(1, 3),
            new Point(1, 4),
            new Point(1, 5),
            new Point(1, 6),
            new Point(1, 7),
            new Point(1, 8),
            new Point(1, 9),
            new Point(1, 10),
            new Four.Point(1, 11)
    };

    @Test
    public void shouldFindBestAngle() {
        Double angle = Four.findBestAngle(forrest, 45);
        assertEquals(45, angle, 0.001);
    }

    @Test
    public void shouldReturnAngleOfTheOnlyPoint() {
        Double angle = Four.findBestAngle(new Point[]{new Point(1, 1)}, 1);
        assertEquals(45, angle, 0.001);
    }

}