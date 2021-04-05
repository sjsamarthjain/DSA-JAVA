package com.company;

public class SolutionUsingMemoization {
    public static int fibb(int n, int[] dp) {
        if (n == 1 || n == 0) {
            return n;
        }
        int ans1, ans2;

        if (dp[n - 1] == -1) {
            ans1 = fibb(n - 1, dp);
            dp[n - 1] = ans1;
        } else
            ans1 = dp[n - 1];

        if (dp[n - 2] == -1) {
            ans2 = fibb(n - 2, dp);
            dp[n - 2] = ans1;
        } else
            ans2 = dp[n - 2];

        int finalAns = ans1 + ans2;
        return finalAns;

    }
}
