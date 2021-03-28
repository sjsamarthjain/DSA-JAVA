package com.company;

public class solution {


    public static int[][] subsetsSumK(int arr[], int k) {

        return subsetsToK(arr, 0, arr.length - 1, k);
    }

    public static int[][] subsetsToK(int[] arr, int start, int end, int k) {

        if (start > end) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        int[][] smallAns1 = subsetsToK(arr, start + 1, end, k - arr[start]);
        int[][] smallAns2 = subsetsToK(arr, start + 1, end, k);
        int[][] ans = new int[smallAns1.length + smallAns2.length][];
        for (int i = 0; i < smallAns1.length; i++) {
            ans[i] = new int[smallAns1[i].length + 1];
            ans[i][0] = arr[start];
            for (int j = 0; j < smallAns1[i].length; j++) {
                ans[i][j + 1] = smallAns1[i][j];
            }

        }
        for (int i = 0; i < smallAns2.length; i++) {
            ans[i + smallAns1.length] = new int[smallAns2[i].length];
            for (int j = 0; j < smallAns2[i].length; j++) {
                ans[i + smallAns1.length][j] = smallAns2[i][j];
            }
        }
        return ans;
    }
}
