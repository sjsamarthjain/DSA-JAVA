package com.company;

public class SolutionUsingRecursiveDP {

    public static int countMinStepsToOne(int n) {
        //Your code goes here
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return countBetter(n, dp);
    }

    public static int countBetter(int n, int[] dp) {

        if (n == 1) {
            return 0;
        }

        int ans1;
        if (dp[n - 1] == -1) {
            ans1 = countBetter(n - 1, dp);
            dp[n - 1] = ans1;
        } else
            ans1 = dp[n - 1];

        int ans2 = Integer.MAX_VALUE;
        if (n % 2 == 0) {
            if (dp[n / 2] == -1) {
                ans2 = countBetter(n / 2, dp);
                dp[n / 2] = ans2;
            } else
                ans2 = dp[n / 2];
        }

        int ans3 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            if (dp[n / 3] == -1) {
                ans3 = countBetter(n / 3, dp);
                dp[n / 3] = ans3;
            } else
                ans3 = dp[n / 3];
        }

        return 1 + Math.min(ans1, Math.min(ans2, ans3));
    }

}
