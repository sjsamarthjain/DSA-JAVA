package com.company;

public class Main {

    public static void main(String[] args) {
	// Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time
        // complexity where N is the size of the linked list.
    }


    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    public static class Solution {

        public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
            //Your code goes here
            if(head==null || head.next==null){
                return head;
            }
            LinkedListNode reverseHead = reverseLinkedListRec(head.next);
//            LinkedListNode temp=reverseHead;
//            while(temp.next	!=null){
//                temp=temp.next;
//            }
            //temp.next=head;
            LinkedListNode reverseTail = head.next;
            reverseTail.next=head;
            head.next=null;
            return reverseHead;

        }

    }

}

