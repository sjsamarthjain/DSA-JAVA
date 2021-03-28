package com.company;

public class SolutionMemoization {

    public static int minCostPath(int[][] arr) {
        //Your code goes here
        //1 extra row and column
        int dp[][] = new int[arr.length + 1][arr[0].length + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return better(arr, 0, 0, dp);
    }

    public static int better(int[][] arr, int i, int j, int dp[][]) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }

        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE;
        }

        int ans1 = arr[i][j];
        int ans2, ans3, ans4;

        if (dp[i + 1][j] == Integer.MIN_VALUE) {
            ans2 = better(arr, i + 1, j, dp);
            dp[i + 1][j] = ans2;
        } else
            ans2 = dp[i + 1][j];

        if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
            ans3 = better(arr, i + 1, j + 1, dp);
            dp[i + 1][j + 1] = ans3;
        } else
            ans3 = dp[i + 1][j + 1];

        if (dp[i][j + 1] == Integer.MIN_VALUE) {
            ans4 = better(arr, i, j + 1, dp);
            dp[i][j + 1] = ans4;
        } else
            ans4 = dp[i][j + 1];


        return ans1 + Math.min(ans2, Math.min(ans3, ans4));
    }
}
