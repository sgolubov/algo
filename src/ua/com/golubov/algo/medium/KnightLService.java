package ua.com.golubov.algo.medium;

import java.util.ArrayDeque;

public class KnightLService {

    private static final int INF = -1;

    private static final int N = 42;

    private static final int[] q = new int[N * N];
    private static final int[][] d = new int[N][N];

    public static int[][] calculate(int n) {
        int[][] result = new int[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                result[i - 1][j - 1] = solve(n, i, j);
            }
        }
        return result;
    }

    private static int solve(int n, int da, int db) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) d[i][j] = INF;
        int head = 0;
        int tail = 0;
        q[tail++] = 0;
        d[0][0] = 0;
        ArrayDeque<Pair<Integer, Integer>> moves = new ArrayDeque<>();
        for (int i = -1; i <= 1; i += 2) {
            for (int j = -1; j <= 1; j += 2) {
                moves.push(new Pair<>(da * i, db * j));
                if (da != db) {
                    moves.push(new Pair<>(db * i, da * j));
                }
            }
        }
        while (head < tail) {
            int v = q[head++];
            int cx = v / n;
            int cy = v % n;
            for (Pair<Integer, Integer> e : moves) {
                int dx = e.key;
                int dy = e.value;
                if (Math.abs(dx) == Math.abs(dy) && da != db) continue;
                int nx = cx + dx;
                int ny = cy + dy;
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || d[nx][ny] != INF) continue;
                d[nx][ny] = d[cx][cy] + 1;
                q[tail++] = nx * n + ny;
            }
        }
        return d[n - 1][n - 1] == INF ? -1 : d[n - 1][n - 1];
    }

    private static class Pair<K, V> {
        private final K key;
        private final V value;

        private Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
