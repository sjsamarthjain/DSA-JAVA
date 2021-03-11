package com.company;

public class Solution {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if (root == null) {
            return false;
        }

        boolean ans = false;

        if (root.data == x) {
            return true;
        }

        ans = isNodePresent(root.left, x);
        if (ans)
            return ans;
        ans = isNodePresent(root.right, x);

        return ans;
    }

}
