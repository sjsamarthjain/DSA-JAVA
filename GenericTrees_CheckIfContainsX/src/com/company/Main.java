package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//Given a generic tree and an integer x, check if x is present in the given tree or not. Return true
        // if x is present, return false otherwise.
    }
}
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data) {
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }

}
