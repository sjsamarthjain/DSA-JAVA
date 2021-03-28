package com.company;

import java.util.*;

public class Solution {

    public static int buyTicket(int arr[], int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            q.add(i);
        }


        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        Iterator iterator = pq.iterator();

        int time = 0;
        int i = 0;
        while (iterator.hasNext()) {
            if (arr[q.peek()] < pq.peek()) {
                int temp = q.poll();
                q.add(temp);
            } else if (arr[q.peek()] == pq.peek()) {
                if (k == q.peek()) {
                    time++;
                    break;
                }
                time++;
                q.poll();
                pq.poll();
            }
        }

        return time;
    }
}
