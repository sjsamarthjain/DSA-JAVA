package com.company;
import java.util.Arrays;
public class solution {

    public static int maximumProfit(int arr[]) {
        // Write your code here

        Arrays.sort(arr);
        int[] profit = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            profit[i] = (arr.length - i) * arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i : profit) {
            if (max < i) {
                max = i;
            }
        }
        return max;

    }

}
