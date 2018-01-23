package ua.com.golubov.algo.codility;

public class PermCheckService {

    public int solution(int[] A) {

        int numCounts[] = new int[A.length];

        for (int num : A) {
            if (num > A.length) {
                return 0;
            }
            numCounts[num - 1]++;
        }

        for (int count : numCounts) {
            if (count != 1) {
                return 0;
            }
        }

        return 1;
    }

}
