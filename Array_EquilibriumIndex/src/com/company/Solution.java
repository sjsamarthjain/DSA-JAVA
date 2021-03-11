package com.company;

public class Solution {

    public static int arrayEquilibriumIndex(int[] arr) {
        //Your code goes here
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        //full array total sum

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            rightSum -= arr[i];               // totalsum-arr[i]
            if (leftSum == rightSum) {           // check leftSum==rightSum
                return i;
            }

            leftSum += arr[i];            // next element leftSum

        }
        return -1;
    }
}
