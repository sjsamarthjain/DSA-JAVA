package com.company;

public class Solution {

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        int len = length(head);
        LinkedListNode<Integer> temp = head;
        LinkedListNode helper = head;
        LinkedListNode<Integer> temp2 = head;
        LinkedListNode<Integer> temp3 = head;
        if (n == 0) {
            return head;
        }

        int j = 0;
        while (temp != null) {
            if (j == len - n - 1) {
                helper = temp.next;
                //temp.next=null;
                break;
            }
            temp = temp.next;
            j++;
        }
        int k = 0;
        while (temp2 != null) {
            if (k == len - 1) {
                temp2.next = head;
                break;
            }
            temp2 = temp2.next;
            k++;
        }
        k = 0;
        while (k <= len - 1) {
            if (k == len - 1 - n) {
                temp3.next = null;
                break;
            }
            k++;
            temp3 = temp3.next;
        }
        head = helper;
        return head;
    }

    public static int length(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode<Integer> temp = head;
        int ans = 0;
        while (temp != null) {
            ans++;
            temp = temp.next;
        }
        return ans;
    }
}
