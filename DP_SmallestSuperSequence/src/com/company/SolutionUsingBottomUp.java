package com.company;

public class SolutionUsingBottomUp {

    public static int smallestSuperSequence(String str1, String str2) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return str1.length() + str2.length() - lcs(str1, str2);

    }

    public static int lcs(String s, String t) {
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
