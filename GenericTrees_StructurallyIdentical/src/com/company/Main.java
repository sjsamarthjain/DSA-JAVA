package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.
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

