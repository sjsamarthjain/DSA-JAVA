package com.company;

public class Solution {

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return 0;
        }
        int h = height(root.left) + height(root.right) + 1;
        int ldiam = diameterOfBinaryTree(root.left);
        int rdiam = diameterOfBinaryTree(root.right);

        return Math.max(h, Math.max(ldiam, rdiam));
    }

    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight >= rightHeight) {
            return 1 + leftHeight;
        } else
            return 1 + rightHeight;


    }

}
