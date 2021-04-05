package com.company;

public class SolutionUsingRecursion {


    public static int countWaysToMakeChange(int denominations[], int value) {
        //For the given infinite supply of coins of each of denominations, D = {D0, D1, D2, D3, ...... Dn-1}.
        // You need to figure out the total number of ways W, in which you can make the change for Value V
        // using coins of denominations D.
        //Return 0 if the change isn't possible.
        if (value == 0) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] <= value) {
                ans = ans + countWaysToMakeChange(denominations, value - denominations[i]);
            }
        }

        return ans;
    }

}
