package com.company;

public class Solution {

    public static int count(int n) {
        if (n < 10) {
            return 1;
        }
        int smallAns = count(n / 10);
        return smallAns + 1;
    }

}
