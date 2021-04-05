package com.company;

public class SolutionUsingMemoization {

    public static int editDistance(String s1, String s2) {

        //Your code goes here
        int m = s1.length();
        int n = s2.length();

        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        return editDistance(s1, s2, dp);

    }

    public static int editDistance(String s1, String s2, int[][] storage) {
        int m = s1.length();
        int n = s2.length();
        if (s1.length() == 0) {
            return s2.length();
        }
        if (s2.length() == 0) {
            return s1.length();
        }
        if (storage[m][n] != -1) {
            return storage[m][n];
        }
        if (s1.charAt(0) == s2.charAt(0)) {
            return editDistance(s1.substring(1), s2.substring(1), storage);
        }

        storage[m][n] = 1 + Math.min(Math.min(editDistance(s1.substring(1), s2.substring(1), storage),
                editDistance(s1.substring(1), s2, storage)
        ), editDistance(s1, s2.substring(1), storage));
        return storage[m][n];


    }


}
