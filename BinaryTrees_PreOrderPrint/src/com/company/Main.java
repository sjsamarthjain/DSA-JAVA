package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given Binary Tree of integers, print the pre-order traversal.
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


