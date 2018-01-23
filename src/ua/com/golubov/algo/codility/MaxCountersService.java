package ua.com.golubov.algo.codility;

public class MaxCountersService {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int addAtTheEnd = 0;

        for (int num : A) {
            if (num <= N) {
                counters[num - 1]++;
                if (counters[num - 1] > currentMax) {
                    currentMax = counters[num - 1];
                }
            }
            if (num == N + 1) {
                addAtTheEnd += currentMax;
                currentMax = 0;
                counters = new int[N];
            }

        }

        if (addAtTheEnd != 0) {
            for (int i = 0; i < counters.length; i++) {
                counters[i] += addAtTheEnd;
            }
        }

        return counters;
    }


}
