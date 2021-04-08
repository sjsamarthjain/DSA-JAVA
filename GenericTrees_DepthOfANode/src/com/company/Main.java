package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Print all nodes at depth k
    }
    public static void printAtK(TreeNode<Integer> root,int k){
        if(k<0){
            return;
        }
        if(k==0){
             System.out.println(root.data);
             return;
        }
        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
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

