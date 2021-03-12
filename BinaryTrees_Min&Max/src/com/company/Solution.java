package com.company;

public class Solution {

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        int max = findMax(root);
        int min = findMin(root);
        Pair ans = new Pair(min, max);
        return ans;
    }

    static int findMax(BinaryTreeNode<Integer> node) {
        if (node == null)
            return 0;

        int max = node.data;
        int leftMax, rightMax;

        if (node.left != null) {
            leftMax = findMax(node.left);
            max = Math.max(max, leftMax);
        }

        if (node.right != null) {
            rightMax = findMax(node.right);
            max = Math.max(max, rightMax);
        }

        return max;
    }

    static int findMin(BinaryTreeNode<Integer> node) {
        if (node == null)
            return 0;

        int min = node.data;
        int leftMin, rightMin;

        if (node.left != null) {
            leftMin = findMin(node.left);
            min = Math.min(min, leftMin);
        }

        if (node.right != null) {
            rightMin = findMin(node.right);
            min = Math.min(min, rightMin);
        }

        return min;

    }

}
