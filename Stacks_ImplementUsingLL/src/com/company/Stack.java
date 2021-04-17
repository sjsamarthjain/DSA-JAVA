package com.company;

public class Stack {

    //Define the data members
    private int size;
    private Node head;

    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node temp = new Node(element);
        // temp.data=element;
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if (size == 0) {
            return -1;
        } else {
            int temp1 = head.data;
            head = head.next;
            --size;
            return temp1;
        }
    }

    public int top() {
        //Implement the top() function
        if (size == 0) {
            return -1;
        } else {
            return head.data;
        }
    }
}
