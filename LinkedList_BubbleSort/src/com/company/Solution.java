package com.company;

public class Solution {

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> orginalHead = head;
        int n = length(head);
        for (int i = 0; i < n - 1; i++) {
            LinkedListNode<Integer> prev = null, curr = orginalHead;
            for (int j = 0; j < n - i - 1; j++) {                           // while(curr.next!=null)

                if (curr.data <= curr.next.data) {

                    prev = curr;
                    curr = curr.next;

                } else {

                    if (prev == null) {

                        LinkedListNode<Integer> curr2 = curr.next;
                        LinkedListNode<Integer> temp = curr2.next;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                        orginalHead = curr2;

                    } else {
                        LinkedListNode<Integer> curr2 = curr.next;
                        LinkedListNode<Integer> temp = curr2.next;
                        prev.next = curr2;
                        curr2.next = curr;
                        curr.next = temp;
                        prev = curr2;
                    }


                }

            }

        }
        return orginalHead;
    }


    public static int length(LinkedListNode<Integer> head) {

        int l = 0;
        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }
}
