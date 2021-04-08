package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void preOrder(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }

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