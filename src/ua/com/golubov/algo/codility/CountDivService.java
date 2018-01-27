package ua.com.golubov.algo.codility;

public class CountDivService {

    public int naiveSolution(int A, int B, int K) {
        int counter = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                counter++;
            }
        }
        return counter;
    }

}
