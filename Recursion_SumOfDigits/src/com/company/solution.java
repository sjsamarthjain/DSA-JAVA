package com.company;

public class solution {

    public static int sumOfDigits(int n) {
        // Write your code here

        if (n == 0) {
            return 0;
        }

        int small = n % 10;

        return small + sumOfDigits(n / 10);

    }
}
