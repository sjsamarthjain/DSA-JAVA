package com.company;

public class Main {

    public static void main(String[] args) {
	//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its
        // modified list.
        // 'k' is a positive integer and is less than or equal to the length of the linked list. If the number of
        // nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}


