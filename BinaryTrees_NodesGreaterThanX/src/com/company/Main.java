package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given a binary tree of integers and an integer X, find and return the total number
        // of nodes of the given binary tree which are having data greater than X.
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

