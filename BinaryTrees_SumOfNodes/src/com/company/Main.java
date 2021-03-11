package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given Binary Tree of integers, find and return the sum of all the nodes data.
        //Example:
        //                        10
        //                      /      \
        //                    20      30
        //                   /    \
        //                 40    50
        //
        //When we sum up all the nodes data together, [10, 20, 30, 40 50] we get 150. Hence, the output will be 150.
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}



