package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given a generic tree, count and return the sum of all nodes present in the given tree.
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

