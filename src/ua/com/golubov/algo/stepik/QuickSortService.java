package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuickSortService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < n + n; i += 2) {
            positions.add(new Position(Type.LEFT_EDGE, in.nextInt()));
            positions.add(new Position(Type.RIGHT_EDGE, in.nextInt()));

        }

        int[] points = new int[m];
        for (int j = 0; j < m; j++) {
            int p = in.nextInt();
            points[j] = p;
            positions.add(new Position(Type.POINT, p));
        }
        Map<Integer, Integer> result = countPointIntersection(positions);
        for (int matchPoint : points) {
            System.out.print(result.get(matchPoint) + " ");
        }
    }

    public static Map<Integer, Integer> countPointIntersection(List<Position> positions) {
        Map<Integer, Integer> resultDictionary = new HashMap<>();

        positions.sort(Comparator.comparing(Position::getCoordinate).thenComparing(Position::getType));

        int counter = 0;

        for (Position position : positions) {

            switch (position.type) {
                case LEFT_EDGE:
                    counter++;
                    break;
                case RIGHT_EDGE:
                    counter--;
                    break;
                case POINT:
                    resultDictionary.put(position.coordinate, counter);
                    break;
            }

        }

        return resultDictionary;
    }

    public enum Type {
        LEFT_EDGE, POINT, RIGHT_EDGE;
    }

    public static class Position {

        private final Type type;
        private final int coordinate;

        public Position(Type type, int coordinate) {
            this.type = type;
            this.coordinate = coordinate;
        }

        Type getType() {
            return type;
        }

        int getCoordinate() {
            return coordinate;
        }
    }

}
