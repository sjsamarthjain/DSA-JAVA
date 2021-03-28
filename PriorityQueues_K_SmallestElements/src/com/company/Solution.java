package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Solution {

    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            int temp = pq.peek();
            if (temp > input[i]) {
                pq.poll();
                pq.add(input[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            ans.add((int) iterator.next());
        }
        return ans;

    }
}
