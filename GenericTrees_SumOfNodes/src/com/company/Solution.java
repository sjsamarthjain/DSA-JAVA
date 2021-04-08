package com.company;

public class Solution {


    public static int sumOfAllNode(TreeNode<Integer> root) {
        if (root == null) {
            //Not a vase case but an edge case
            //base case handled by for loop
            return 0;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            sum += sumOfAllNode(root.children.get(i));
        }
        return sum;
    }
}
