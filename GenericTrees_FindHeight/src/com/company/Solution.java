package com.company;

public class Solution {

    public static int getHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        if (root.children.size() == 0) {
            return 1;
        }

        int opts[] = new int[root.children.size()];

        for (int i = 0; i < root.children.size(); i++) {
            opts[i] = getHeight(root.children.get(i));
        }
        int maxHeight = -1;
        for (int i = 0; i < opts.length; i++) {
            if (opts[i] > maxHeight) {
                maxHeight = opts[i];
            }
        }
        return ++maxHeight;
    }

}
