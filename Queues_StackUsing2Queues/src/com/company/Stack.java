package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    //Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Stack() {
        //Implement the Constructor
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.size() == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        //Implement the pop() function
        if (q1.size() == 0) {
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int ans = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return ans;
    }

    public int top() {
        //Implement the top() function
        if (q1.size() == 0) {
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int ans = q1.poll();
        q2.add(ans);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return ans;

    }
}
