package com.company;

import java.util.ArrayList;

public class Solution {

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        int len = length(head);
        ArrayList<Integer> copy = new ArrayList<Integer>(len);
        LinkedListNode temp = head;
        while (temp != null) {
            copy.add((int) temp.data);
            temp = temp.next;
        }

        int i = 0, j = len - 1;
        while (i < j) {
            if (copy.get(i) != copy.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;


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
