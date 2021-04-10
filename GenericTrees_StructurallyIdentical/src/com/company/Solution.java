package com.company;

public class Solution {


    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {

        // Write your code here
        if (root1.data != root2.data) {
            return false;
        }
        for (int i = 0; i < root1.children.size(); i++) {
            if (checkIdentical(root1.children.get(i), root2.children.get(i)) == false) {
                return false;
            }
        }
        return true;
    }

}
