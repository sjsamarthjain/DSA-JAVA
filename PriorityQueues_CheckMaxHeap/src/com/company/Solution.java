package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Solution {

    public static boolean checkMaxHeap(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int i = 0;
        boolean ans = true;
    
        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            if ((int) iterator.next() != arr[i]) {
                return false;
            }
            i++;
        }

        return ans;

    }
}
