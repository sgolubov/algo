package ua.com.golubov.algo.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumDominoRotations {

    public int minDominoRotations(int[] A, int[] B) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Integer aCounter = counter.getOrDefault(A[i], 0);
            Integer bCounter = counter.getOrDefault(B[i], 0);
            counter.put(A[i], ++aCounter);
            counter.put(B[i], ++bCounter);
        }

        Integer highestFrequency = 0;
        Integer targetNumber = -1;
        for (Map.Entry<Integer, Integer> counterEntry : counter.entrySet()) {
            if (counterEntry.getValue() > highestFrequency) {
                highestFrequency = counterEntry.getValue();
                targetNumber = counterEntry.getKey();
            }
        }

        if (counter.get(targetNumber) < A.length) {
            return -1;
        }

        return minRotations(A, B, targetNumber);
    }

    private int minRotations(int[] A, int[] B, Integer target) {
        int minRotationsA = 0;
        int minRotationsB = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i])
                continue;

            if (A[i] != target) {
                minRotationsA++;
            }

            if (B[i] != target) {
                minRotationsB++;
            }
        }

        return Math.min(minRotationsA, minRotationsB);
    }

    /**
     * Return min number of rotations
     * if one could make all elements in A or B equal to x.
     * Else return -1.
     */
    public int check(int x, int[] A, int[] B, int n) {
        // how many rotations should be done
        // to have all elements in A equal to x
        // and to have all elements in B equal to x
        int rotations_a = 0, rotations_b = 0;
        for (int i = 0; i < n; i++) {
            // rotations couldn't be done
            if (A[i] != x && B[i] != x) return -1;
            // A[i] != x and B[i] == x
            else if (A[i] != x) rotations_a++;
            // A[i] == x and B[i] != x
            else if (B[i] != x) rotations_b++;
        }
        // min number of rotations to have all
        // elements equal to x in A or B
        return Math.min(rotations_a, rotations_b);
    }

    public int minDominoRotationsEfficient(int[] A, int[] B) {
        int n = A.length;
        int rotations = check(A[0], B, A, n);
        // If one could make all elements in A or B equal to A[0]
        if (rotations != -1 || A[0] == B[0]) return rotations;
        // If one could make all elements in A or B equal to B[0]
        else return check(B[0], B, A, n);
    }

}
