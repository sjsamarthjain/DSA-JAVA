package com.company;

public class Main {

    public static void main(String[] args) {
	//For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
        //Return the output as an object of Pair class, which is already created.
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

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}










