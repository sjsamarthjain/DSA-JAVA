package com.company;

public class SolutionUsingIteration {

    public static int minCount(int n) {
        //Your code goes here
        int dp[] = new int[n + 1];
        return minCountBetter(n, dp);

    }

    public static int minCountBetter(int n, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minAns = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int currAns = dp[i - j * j];
                if (minAns > currAns) {
                    minAns = currAns;
                }
            }
            dp[i] = minAns + 1;
        }
        return dp[n];
    }

}
