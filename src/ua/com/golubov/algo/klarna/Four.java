package ua.com.golubov.algo.klarna;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Four {

    public static Double findBestAngle(Point[] forrest, double alpha) {
        if (forrest == null || forrest.length == 0 || alpha == 0d) {
            return 0d;
        }

        if (forrest.length == 1) {
            return getAngle(forrest[0]);
        }

        List<Double> sortedAngles = Arrays.stream(forrest)
                .map(Four::getAngle)
                .sorted()
                .collect(Collectors.toList());

        return findBestAngle(sortedAngles, alpha);
    }

    private static Double getAngle(Point target) {
        double angle = Math.toDegrees(Math.atan2(target.y, target.x));

        if (angle < 0) {
            angle += 360;
        }

        return angle;
    }

    private static Double findBestAngle(List<Double> sortedAngles, double alpha) {
        Deque<Double> window = new LinkedList<>();

        int max = 0;
        double maxAngle = 0;

        double currentAngle = sortedAngles.get(0);
        window.add(currentAngle);
        double currentDeltaAngle = 0;

        for (int i = 1; i < sortedAngles.size(); i++) {
            currentDeltaAngle += sortedAngles.get(i) - currentAngle;
            currentAngle = sortedAngles.get(i);
            window.add(currentAngle);
            if (currentDeltaAngle >= alpha || i == sortedAngles.size() - 1) {
                Double angle = window.remove();
                int windowSize = window.size();
                if (max < windowSize) {
                    max = windowSize;
                    maxAngle = angle;
                }
                currentDeltaAngle -= window.peekFirst() - angle;
                while (currentDeltaAngle >= alpha) {
                    angle = window.remove();
                    currentDeltaAngle -= window.peekFirst() - angle;
                }
            }
        }

        return maxAngle;
    }

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
