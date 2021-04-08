package com.company;

public class Solution {


    public static int countLeafNodes(TreeNode<Integer> root) {

        // Write your code here
        if (root == null) {
            return -1;
        }

        if (root.children.size() == 0) {
            return 1;
        }

        int sum = 0;
        for (int i = 0; i < root.children.size(); i++) {
            sum += countLeafNodes(root.children.get(i));
        }

        return sum;
    }

}
