package ua.com.golubov.algo.codility;

import java.util.Arrays;

public class ArrayRotationService {

    public int[] solution(int[] A, int K) {
        if (A.length == 1 || A.length == K || A.length == 0) {
            return A;
        }

        if (K > A.length) {
            K = K % A.length;
        }

        if (K == 0) {
            return A;
        }

        int[] B = new int[A.length + K];

        System.arraycopy(A, 0, B, K, A.length);

        System.arraycopy(B, B.length - K, B, 0, K);

        return Arrays.copyOfRange(B, 0, B.length - K);
    }


}
