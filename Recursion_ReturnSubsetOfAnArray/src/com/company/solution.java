package com.company;

public class solution {

    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int arr[]) {
        return subsetsOfArray(arr, 0, arr.length - 1);

    }


    public static int[][] subsetsOfArray(int[] arr, int start, int end) {

        if (start > end) {
            return new int[1][0];
        }
        int[][] smallAns = subsetsOfArray(arr, start + 1, end);
        int[][] ans = new int[smallAns.length * 2][];

        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                ans[i][j] = smallAns[i][j];
            }
        }
        for (int i = smallAns.length; i < ans.length; i++) {
            ans[i] = new int[smallAns[i - smallAns.length].length + 1];
            ans[i][0] = arr[start];
            for (int j = 1; j < ans[i].length; j++) {
                ans[i][j] = smallAns[i - smallAns.length][j - 1];
            }
        }
        return ans;
    }
}
