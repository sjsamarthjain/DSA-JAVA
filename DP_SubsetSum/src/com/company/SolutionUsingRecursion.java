package com.company;

public class SolutionUsingRecursion {
    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return better(arr, sum, 0);

    }

    public static boolean better(int[] arr, int k, int i) {
        if (i == arr.length) {
            if (k == 0) {
                return true;
            } else
                return false;
        }
        boolean b1 = better(arr, k, i + 1);
        boolean b2 = better(arr, k - arr[i], i + 1);
        if (b1 || b2) {
            return true;
        } else
            return false;
    }
}
