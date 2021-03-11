package com.company;

public class Solution {

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode mid = midPoint(head);
        LinkedListNode part1head = head;
        LinkedListNode part2head = mid.next;
        mid.next = null;
        LinkedListNode collect1 = mergeSort(part1head);
        LinkedListNode collect2 = mergeSort(part2head);
        return merge(collect1, collect2);


    }


    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here

        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head.next;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }


    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode t1 = head1, t2 = head2, head, tail;

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if ((int) t1.data <= (int) t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if ((int) t1.data <= (int) t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            tail.next = t1;
        } else
            tail.next = t2;

        return head;

    }

}
