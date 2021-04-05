package com.company;

public class SolutionUsingMemoization {

    public static int lcs(String s, String t) {
        //Your code goes here
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return better(s, t, 0, 0, dp);
    }

    public static int better(String s1, String s2, int i, int j, int[][] dp) {
        if (i > s1.length() - 1 || j > s2.length() - 1) {
            return 0;
        }
        int ans;
        if (s1.charAt(i) == (s2.charAt(j))) {
            int smallAns;
            if (dp[i + 1][j + 1] == -1) {
                smallAns = better(s1, s2, i + 1, j + 1, dp);
                dp[i + 1][j + 1] = smallAns;
            } else {
                smallAns = dp[i + 1][j + 1];
            }
            ans = smallAns + 1;
        } else {
            int ans1, ans2;
            if (dp[i + 1][j] == -1) {
                ans1 = better(s1, s2, i + 1, j, dp);
                dp[i + 1][j] = ans1;
            } else {
                ans1 = dp[i + 1][j];
            }

            if (dp[i][j + 1] == -1) {
                ans2 = better(s1, s2, i, j + 1, dp);
                dp[i][j + 1] = ans2;
            } else {
                ans2 = dp[i][j + 1];
            }
            ans = Math.max(ans1, ans2);
        }
        return ans;

    }

}
