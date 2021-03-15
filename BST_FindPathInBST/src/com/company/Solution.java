package com.company;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {

        if (root == null) {
            return null;
        }

        if (root.data == data) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(data);
            return ans;
        }
        if (data < root.data) {
            ArrayList<Integer> left = getPath(root.left, data);
            if (left != null) {
                left.add(root.data);
                return left;
            }
        }
        if (data > root.data) {
            ArrayList<Integer> right = getPath(root.right, data);
            if (right != null) {
                right.add(root.data);
                return right;
            }
        }
        return null;
    }
}
