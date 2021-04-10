package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
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
