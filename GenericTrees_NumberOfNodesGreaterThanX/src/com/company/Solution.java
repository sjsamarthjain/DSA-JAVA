package com.company;

public class Solution {


    public static int numNodeGreater(TreeNode<Integer> root, int x) {

        if (root == null) {
            return -1;
        }

        int ans = 0;
        if (root.data > x) {
            ans++;
        }

        for (int i = 0; i < root.children.size(); i++) {
            ans += numNodeGreater(root.children.get(i), x);
        }
        return ans;


    }

}
