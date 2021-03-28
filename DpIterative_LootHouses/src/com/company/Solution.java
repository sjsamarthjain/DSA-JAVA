package com.company;

public class Solution {

    public static int maxMoneyLooted(int[] houses) {
        //Your code goes here
        if (houses.length <= 0) {
            return 0;
        }
        int dp[] = new int[houses.length + 1];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < houses.length; i++) {
            dp[i] = Math.max(dp[i - 2] + houses[i], dp[i - 1]);
        }
        int ans = dp[houses.length - 1];
        return ans;
    }

}
