package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given a tree and an integer x, find and return number of Nodes which are greater than x.
    }
}

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}
