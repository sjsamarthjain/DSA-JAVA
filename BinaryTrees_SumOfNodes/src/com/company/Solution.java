package com.company;

public class Solution {


    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.
        if (root == null) {
            return 0;
        }

        int l = getSum(root.left);
        int r = getSum(root.right);
        return root.data + l + r;

    }

}
