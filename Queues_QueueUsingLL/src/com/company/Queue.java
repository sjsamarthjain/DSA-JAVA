package com.company;

public class Queue {

    //Define the data members
    private Node front;
    private Node rear;
    private int size;


    public Queue() {
        //Implement the Constructor
        front = null;
        rear = null;
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


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        if (front == null) {
            front = new Node(data);
            rear = front;
        } else {
            Node temp = new Node(data);
            rear.next = temp;
            rear = temp;
        }
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if (front == null) {
            return -1;
        } else {
            int temp = front.data;
            front = front.next;
            size--;
            return temp;
        }

    }


    public int front() {
        //Implement the front() function
        if (front == null) {
            return -1;
        } else
            return front.data;
    }
}
