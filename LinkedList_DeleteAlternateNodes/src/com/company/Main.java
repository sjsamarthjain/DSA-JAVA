package com.company;

public class Main {

    public static void main(String[] args) {
	//Given a Singly Linked List of integers, delete all the alternate nodes in the list.
        //Example:
        //List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
        //Alternate nodes will be:  20, 40, and 60.
        //
        //Hence after deleting, the list will be:
        //Output: 10 -> 30 -> 50 -> null
        //Note :
        //The head of the list will remain the same. Don't need to print or return anything.
    }
}
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

