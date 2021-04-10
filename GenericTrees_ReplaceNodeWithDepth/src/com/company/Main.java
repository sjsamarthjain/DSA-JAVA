package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//In a given Generic Tree, replace each node with its depth value. You need to just update the data of
        // each node, no need to return or print anything.
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
