package ua.com.golubov.algo.codility;

public class MissingIntegerService {

    public int solution(int[] A) {

        int numCounts[] = new int[A.length + 2];

        for (int num : A) {
            if (num > 0 && num < A.length + 2) {
                numCounts[num]++;
            }
        }

        for (int i = 1; i < numCounts.length; i++) {
            if (numCounts[i] == 0) {
                return i;
            }
        }

        return -1;
    }

}
