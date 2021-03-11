package com.company;

public class Solution {

    public static void printReverse(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null) {
            return;
        }

        printReverse(head.next);
        System.out.print(head.data + " ");
    }

}
