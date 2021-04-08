package com.company;

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {

        if (head.next == null || head.next.next == null)
            return;

        Node<Integer> temp1 = head;

        int count = 0;

        while (head.next != null) {

            if (count % 2 != 0) {
                temp1.next = head.next;

            }
            temp1 = head;
            head = head.next;
            count++;
        }

        if (count % 2 != 0) {
            temp1.next = null;

        }
    }
}
