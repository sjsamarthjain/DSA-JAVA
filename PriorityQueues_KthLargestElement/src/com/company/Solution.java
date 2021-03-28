package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Solution {

    public static int kthLargest(int n, int[] arr, int k) {
        // Write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int i=0;
        while (i<k-1) {
            pq.poll();
            i++;
        }


        return pq.peek();

    }
}
