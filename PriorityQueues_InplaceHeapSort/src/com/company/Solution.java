package com.company;

public class Solution {

    public static void inplaceHeapSort(int arr[]) {

        //Building heap, non-leaf nodes=n/2
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            downHeapify(arr, i, arr.length);
        }
        //Remove elements from starting one by one, put them at respective last

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr, 0, i);
        }

    }

    public static void downHeapify(int[] arr, int i, int n) {

        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        while (leftChildIndex < n) {
            int minIndex = parentIndex;
            if (arr[leftChildIndex] < arr[minIndex]) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < n && (arr[rightChildIndex] < arr[minIndex])) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                return;
            }
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }

    }
}
