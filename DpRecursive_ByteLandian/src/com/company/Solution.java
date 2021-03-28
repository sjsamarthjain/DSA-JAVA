package com.company;

import java.util.HashMap;

public class Solution {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
        int dp[] = new int[(int) n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return (long) better((int) n, dp);
    }

    public static int better(int n, int[] dp) {
        if (n == 1) {
            return 1;
        }

        int ans1 = n;
        int ans2;
        if (dp[n - n / 2] == -1) {
            dp[n - n / 2] = better(n - n / 2, dp);
            ans2 = dp[n - n / 2];
        } else
            ans2 = dp[n - n / 2];

        int ans3;
        if (dp[n - n / 3] == -1) {
            dp[n - n / 3] = better(n - n / 3, dp);
            ans3 = dp[n - n / 3];
        } else
            ans3 = dp[n - n / 3];

        int ans4;
        if (dp[n - n / 4] == -1) {
            dp[n - n / 4] = better(n - n / 4, dp);
            ans4 = dp[n - n / 4];
        } else
            ans4 = dp[n - n / 4];

        return Math.min(Math.min(ans1, ans2), Math.min(ans3, ans4));

    }

}
