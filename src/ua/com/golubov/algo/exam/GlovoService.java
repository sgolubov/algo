package ua.com.golubov.algo.exam;

import java.math.BigInteger;

public class GlovoService {

    private static final BigInteger UPPER_LIMIT = new BigInteger("1000000000");
    private int[][] grid;
    private boolean[][] visited;

    public int solution(int N, int K) {
        if (K > N) {
            return -1;
        }

        BigInteger factN = factorial(N);
        BigInteger factK = factorial(K);
        BigInteger factNK = factorial(N - K);

        BigInteger result = factN.divide(factK.multiply(factNK));

        return result.compareTo(UPPER_LIMIT) > 0 ? -1 : result.intValue();
    }

    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i < n + 1; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    public int solution(int[][] A) {
        this.grid = A;
        this.visited = new boolean[A.length][A[0].length];

        int countriesCounter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j]) {
                    countriesCounter++;
                    explore(i, j, grid[i][j]);
                }
            }
        }

        return countriesCounter;
    }

    private void explore(int i, int j, int colorCode) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1
                || grid[i][j] != colorCode || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        explore(i + 1, j, colorCode);
        explore(i - 1, j, colorCode);
        explore(i, j + 1, colorCode);
        explore(i, j - 1, colorCode);
    }

}
