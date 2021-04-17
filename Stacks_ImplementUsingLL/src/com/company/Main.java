package com.company;

public class Main {

    public static void main(String[] args) {
	//Implement a Stack Data Structure specifically to store integer data using a Singly Linked List.
        //The data members should be private.
        //You need to implement the following public functions :
        //1. Constructor:
        //It initialises the data members as required.
        //2. push(data) :
        //This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
        //3. pop() :
        //It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
        //4. top :
        //It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
        //5. size() :
        //It returns the size of the stack at any given instance of time.
        //6. isEmpty() :
        //It returns a boolean value indicating whether the stack is empty or not.
    }
}
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

