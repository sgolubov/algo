package ua.com.golubov.algo.codility;

public class TapeEquilibriumService {

    public int solution(int[] A) {
        int[] asc = new int[A.length];

        asc[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            asc[i] += asc[i - 1] + A[i];
        }

        int[] desc = new int[A.length];

        desc[A.length - 1] = A[A.length - 1];

        for (int i = A.length - 2; i > -1; i--) {
            desc[i] += desc[i + 1] + A[i];
        }

        int result = -1;

        for (int i = 1; i < A.length; i++) {
            int r = Math.abs(desc[i] - asc[i - 1]);
            if (r < result || result == -1) {
                result = r;
            }
        }

        return result;
    }

}
