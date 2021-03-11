package com.company;

public class Solution {

    public static BinaryTreeNode<Integer> buildTree(int[] post, int[] in) {
        //Your code goes here
        BinaryTreeNode<Integer> root = helper(post, in, 0, post.length - 1, 0, in.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> helper(int[] post, int[] in, int siPost, int eiPost, int siIn, int eiIn) {
        if (siPost > eiPost) {
            return null;
        }

        int rootData = post[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (in[i] == rootData) {
                rootIndex = i;
                break;
            }
        }

        int siPostLeft = siPost;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int siInRight = rootIndex + 1;
        int eiPostRight = eiPost - 1;
        int eiInRight = eiIn;

        int leftSubtreeLength = eiInLeft - siInLeft + 1;

        int eiPostLeft = siPostLeft + leftSubtreeLength - 1;
        int siPostRight = eiPostLeft + 1;

        BinaryTreeNode<Integer> left = helper(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> right = helper(post, in, siPostRight, eiPostRight, siInRight, eiInRight);

        root.left = left;
        root.right = right;

        return root;
    }

}
