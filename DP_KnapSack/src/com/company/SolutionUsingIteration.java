package com.company;

public class SolutionUsingIteration {

    public static int knapsack(int[] weights, int[] v, int n, int W) {
        //Your code goes here
        int dp[][] = new int[v.length + 1][W + 1];
        for (int i = v.length - 1; i >= 0; i--) {
            for (int w = 0; w <= W; w++) {
                int ans;
                if (weights[i] <= w) {
                    int ans1 = v[i] + dp[i + 1][w - weights[i]];
                    int ans2 = dp[i + 1][w];
                    ans = Math.max(ans1, ans2);
                } else {
                    ans = dp[i + 1][w];
                }
                dp[i][w] = ans;
            }
        }
        return dp[0][W];
    }
}
