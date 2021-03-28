package com.company;

public class SolutionRecurison {

    public static int minCostPath(int[][] input) {
        return better(input, 0, 0);
    }

    public static int better(int arr[][], int i, int j) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }

        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE;
        }

        int ans1 = arr[i][j];
        int ans2 = better(arr, i + 1, j);
        int ans3 = better(arr, i + 1, j + 1);
        int ans4 = better(arr, i, j + 1);

        return ans1 + Math.min(ans2, Math.min(ans3, ans4));

    }
}
