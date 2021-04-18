package com.company;

public class Solution {

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        helper(root, k, "", 0);
    }

    public static void helper(BinaryTreeNode<Integer> root, int k, String path, int currSum) {
        if (root == null)
            return;

        currSum += root.data;
        path += root.data + " ";

        if (root.left == null && root.right == null && currSum == k) {
            System.out.println(path);
            return;
        }

        helper(root.left, k, path, currSum);
        helper(root.right, k, path, currSum);

    }
}
