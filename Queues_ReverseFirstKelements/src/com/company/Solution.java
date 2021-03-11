package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            q.add(input.poll());
        }
        reverseQueue(q);
        while (input.size() != 0) {
            q.add(input.poll());
        }
        while (q.size() != 0) {
            input.add(q.poll());
        }
        return input;

    }


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
