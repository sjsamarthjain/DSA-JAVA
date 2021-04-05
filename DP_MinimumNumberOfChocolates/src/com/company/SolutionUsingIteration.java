package com.company;

public class SolutionUsingIteration {

    public static int getMin(int a[], int n) {

        int[] b = new int[n];

        // Distribute 1 chocolate to each
        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }

        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1])
                b[i] = b[i - 1] + 1;
            else
                b[i] = 1;
        }

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1])
                b[i] = Math.max(b[i + 1] + 1, b[i]);
        }

        // Initialize sum
        int sum = 0;

        // Find total sum
        for (int i = 0; i < n; i++) {
            sum += b[i];
        }

        return sum;

    }
}
