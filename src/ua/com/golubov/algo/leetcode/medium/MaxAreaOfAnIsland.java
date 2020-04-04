package ua.com.golubov.algo.leetcode.medium;

public class MaxAreaOfAnIsland {

    private int[][] grid;
    private boolean[][] visited;

    private int area(int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1
                || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + area(i + 1, j) + area(i - 1, j) + area(i, j + 1) + area(i, j - 1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.visited = new boolean[grid.length][grid[0].length];

        int answer = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                answer = Math.max(answer, area(i, j));
            }
        }

        return answer;
    }


}
