package com.company;

public class Solution {

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if (root == null) {
            return 0;
        }
        int a = countNodesGreaterThanX(root.left, x);
        int b = countNodesGreaterThanX(root.right, x);

        if (root.data > x) {
            return 1 + a + b;
        } else
            return a + b;
    }

}
