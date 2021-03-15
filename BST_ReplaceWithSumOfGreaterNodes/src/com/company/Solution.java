package com.company;

public class Solution {


    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        replaceWithLargerNodesSum2(root, 0);

    }

    public static int replaceWithLargerNodesSum2(BinaryTreeNode<Integer> root, int sum) {

        if (root == null)
            return sum;

        sum = replaceWithLargerNodesSum2(root.right, sum);
        sum += root.data;
        root.data = sum;
        return replaceWithLargerNodesSum2(root.left, sum);
    }
}
