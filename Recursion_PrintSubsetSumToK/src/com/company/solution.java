package com.company;

public class solution {

    public static void printSubsetsSumTok(int arr[], int k) {
        printSubsetsSumTok(arr, 0, arr.length - 1, k, new int[0]);
    }

    public static void printSubsetsSumTok(int arr[], int start, int end, int k, int[] output) {
        if (start > end) {
            if (k == 0) {
                for (int i : output) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            } else {
                return;
            }

        }

        int[] temp = new int[output.length + 1];

        for (int i = 0; i < output.length; i++) {
            temp[i] = output[i];
        }
        temp[temp.length - 1] = arr[start];

        printSubsetsSumTok(arr, start + 1, end, k - arr[start], temp);
        printSubsetsSumTok(arr, start + 1, end, k, output);
    }
}
