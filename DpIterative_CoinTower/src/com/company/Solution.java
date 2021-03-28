package com.company;

public class Solution {
    public static String findWinner(int n, int x, int y) {
        //Your code goes here
        return solve(n, x, y);
    }

    public static String solve(int n, int x, int y) {
        String s1 = "Whis";
        String s2 = "Beerus";

        boolean storage[] = new boolean[n + 1];
        for (int i = 0; i < storage.length; i++) {
            storage[i] = false;
        }

        storage[1] = true;

        for (int i = 2; i <= n; i++) {

            if (i - 1 >= 0 && storage[i - 1] == false) {
                storage[i] = true;
            } else if (i - x >= 0 && storage[i - x] == false) {
                storage[i] = true;
            } else if (i - y >= 0 && storage[i - y] == false) {
                storage[i] = true;
            } else
                storage[i] = false;
        }
        if (storage[n] == false)
            return s1;
        else
            return s2;
    }
}
