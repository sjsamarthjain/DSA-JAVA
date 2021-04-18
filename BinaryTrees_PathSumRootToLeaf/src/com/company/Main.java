package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum
        // of all the node data along the path is equal to K.
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
