package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	//Given a generic tree, print the input tree in level wise order. That is, print the elements at same level
        // in one line (separated by space)
        //. Print different levels in differnet lines.
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
