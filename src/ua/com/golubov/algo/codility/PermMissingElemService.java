package ua.com.golubov.algo.codility;

public class PermMissingElemService {

    public int solution(int[] A) {

        int numCounts[] = new int[A.length + 2];

        for (int num : A) {
            numCounts[num]++;
        }

        for (int i = 1; i < numCounts.length; i++) {
            if (numCounts[i] == 0) {
                return i;
            }
        }

        return -1;
    }


}
