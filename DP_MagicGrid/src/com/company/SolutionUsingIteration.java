package com.company;

public class SolutionUsingIteration {

    //Bottom up from bottom right to top left
    public static int getMinimumStrength(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[n][m - 1] = 1;
        dp[n - 1][m] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int neededStrength = Integer.min(dp[i + 1][j], dp[i][j + 1]) - grid[i][j];
                if (neededStrength <= 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = neededStrength;
                }
            }
        }

        return dp[0][0];
    }
}
