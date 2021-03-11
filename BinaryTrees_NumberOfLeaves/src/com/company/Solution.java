package com.company;

public class Solution {

    public static int numOfLeaves(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return numOfLeaves(root.left) + numOfLeaves(root.right);


    }
}
