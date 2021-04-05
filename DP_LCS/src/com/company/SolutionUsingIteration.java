package com.company;

public class SolutionUsingIteration {

    public static int lcsTopDown(String X, String Y) {
        //Your code goes here
        int m = X.length();
        int n = Y.length();
        int[][] L = new int[m + 1][n + 1];
        int i, j;
        // Following steps build L[m + 1][n + 1]
        // in bottom up fashion. Note that
        // L[i][j] contains length of LCS
        // of X[0..i - 1]and Y[0..j - 1]
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;

                else
                    L[i][j] = Math.max(L[i - 1][j],
                            L[i][j - 1]);
            }
        }

        // L[m][n] contains length of LCS
        // for X[0..n - 1] and Y[0..m - 1]
        return L[m][n];
    }

    public static int lcsBottomUp(String s, String t) {
        //Your code goes here
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int ans;
                if (s.charAt(i) == t.charAt(j)) {
                    ans = 1 + dp[i + 1][j + 1];
                } else {
                    int ans1 = dp[i][j + 1];
                    int ans2 = dp[i + 1][j];
                    ans = Math.max(ans1, ans2);
                }
                dp[i][j] = ans;
            }
        }
        return dp[0][0];
    }

}
