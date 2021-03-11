package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of
        // itself.
        //The root will remain the same. So you just need to insert nodes in the given Binary Tree.
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

