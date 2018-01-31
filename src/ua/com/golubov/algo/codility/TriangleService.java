package ua.com.golubov.algo.codility;

import java.util.Arrays;

public class TriangleService {

    public int solution(int[] A) {
        if (A.length < 3)
            return 0;

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2])
                return 1;
        }

        return 0;
    }

}