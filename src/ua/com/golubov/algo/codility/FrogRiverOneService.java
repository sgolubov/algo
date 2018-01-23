package ua.com.golubov.algo.codility;

public class FrogRiverOneService {

    public int solution(int X, int[] A) {
        int[] path = new int[X];

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                if (path[A[i] - 1] == 0) {
                    path[A[i] - 1] = i;
                }
            }

        }

        int ready = -1;

        for (int stone : path) {
            if (stone == 0) {
                return -1;
            } else if (stone > ready) {
                ready = stone;
            }
        }

        return ready;
    }


}
