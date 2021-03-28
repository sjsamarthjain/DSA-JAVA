package com.company;

public class solution {


    public static void printSubsets(int arr[]) {
        printSubsets(arr, 0, arr.length - 1, new int[0]);
    }


    public static void printSubsets(int[] arr, int start, int end, int[] output) {

        if (start > end) {
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        int[] temp = new int[output.length + 1];

        for (int i = 0; i < output.length; i++) {
            temp[i] = output[i];
        }
        temp[temp.length - 1] = arr[start];

        printSubsets(arr, start + 1, end, temp);
        printSubsets(arr, start + 1, end, output);

    }


}
