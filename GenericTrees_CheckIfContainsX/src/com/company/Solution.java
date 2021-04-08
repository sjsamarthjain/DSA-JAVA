package com.company;

public class Solution {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {

        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true;
        }

        for (int i = 0; i < root.children.size(); i++) {
            if (checkIfContainsX(root.children.get(i), x)) {
                return true;
            }
        }
        return false;
    }

}
