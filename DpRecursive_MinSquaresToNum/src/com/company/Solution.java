package com.company;

public class Solution {

    public static int minCount(int n) {
        //Your code goes here
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return minCountBetter(n, dp);

    }

    public static int minCountBetter(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int smallAns;
            if (dp[n - i * i] == -1) {
                smallAns = minCountBetter(n - i * i, dp);
                dp[n - i * i] = smallAns;
            } else {
                smallAns = dp[n - i * i];
            }
            if (minAns > smallAns) {
                minAns = smallAns;
            }
        }
        return 1 + minAns;
    }

}
