package com.company;

public class SolutionUsingRecursion {

    public static int minCount(int n) {
        //Your code goes here
        if (n == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n * n; i++) {
            int currAns = minCount(n - (i * i));
            if (currAns < min) {
                min = currAns;
            }
        }
        return 1 + min;
    }

}
