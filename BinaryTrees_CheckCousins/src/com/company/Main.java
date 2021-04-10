package com.company;

public class Main {

    public static void main(String[] args) {
	//Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins
        // of each other or not. Two nodes are said to be cousins of each other if they are at same level
        // of the Binary Tree and have different parents.
        //Do it in O(n).
    }
}
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}


