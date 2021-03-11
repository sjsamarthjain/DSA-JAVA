package com.company;

public class Solution {

    public static void quickSort(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        int pivotPos = partition(arr, start, end);
        quickSort(arr, start, pivotPos - 1);
        quickSort(arr, pivotPos + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }

        int pivotPos = start + count;
        int temp = arr[pivotPos];
        arr[pivotPos] = arr[start];
        arr[start] = temp;

        int i = start, j = end;
        while (i < pivotPos && j > pivotPos) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                i++;
                j--;

            }
        }
        return pivotPos;

    }

}
