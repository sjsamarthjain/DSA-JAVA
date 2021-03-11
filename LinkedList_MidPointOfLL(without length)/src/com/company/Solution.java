package com.company;

public class Solution {

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here

        if (head == null || head.next    == null) {
            return head;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head.next;


            while (fast!= null && fast.next  != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

        return slow;

    }

}
