package com.company;

import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	//The diameter of a tree can be defined as the maximum distance between two leaf nodes.
        //Here, the distance is measured in terms of the total number of nodes present along the path of the two
        // leaf nodes, including both the leaves.
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

