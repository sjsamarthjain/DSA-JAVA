package com.company;

import java.util.Queue;

public class Solution {

    public static void reverseQueue(Queue<Integer> q) {
        //Your code goes here
        if (q.size() <= 1) {
            return;
        }

        int small = q.poll();

        reverseQueue(q);
        q.add(small);
    }

}
