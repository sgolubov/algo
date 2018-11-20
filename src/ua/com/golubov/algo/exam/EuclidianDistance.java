package ua.com.golubov.algo.exam;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class EuclidianDistance {

    public static Point[] getKNearestPoints(Point[] points, int k) {
        if (points == null || points.length > k) {
            throw new IllegalArgumentException("Invalid inputs.");
        }

        Queue<Point> pointMaxHeap = new PriorityQueue<>(Comparator.comparingDouble(Point::getEuclidianDistanceToZero));

        for (Point point : points) {
            if (pointMaxHeap.size() < k) {
                pointMaxHeap.add(point);
            } else {
                Point currentMax = pointMaxHeap.peek();
                if (currentMax.getEuclidianDistanceToZero() < point.getEuclidianDistanceToZero()) {
                    pointMaxHeap.poll();
                    pointMaxHeap.add(point);
                }
            }
        }

        return pointMaxHeap.toArray(new Point[k]);
    }

    public static class Point {

        private final int x, y;
        private Double euclidianDistance;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (x != point.x) return false;
            return y == point.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }

        // SQR[ (x1-y1)2 + (x2-y2)2 ]
        double getEuclidianDistanceToZero() {
            if (euclidianDistance != null) {
                return euclidianDistance;
            }
            euclidianDistance = Math.abs(Math.pow(x, 2) - 2 * x * y + Math.pow(y, 2));
            return euclidianDistance;
        }
    }
}
