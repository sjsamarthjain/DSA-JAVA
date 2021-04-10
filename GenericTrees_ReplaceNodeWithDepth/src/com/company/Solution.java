package com.company;

public class Solution {


    public static void replaceWithDepthValue(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        better(root, 0);

    }

    public static void better(TreeNode<Integer> root, int k) {

        root.data = k;

        for (int i = 0; i < root.children.size(); i++) {
            better(root.children.get(i), k + 1);
        }

    }


}
