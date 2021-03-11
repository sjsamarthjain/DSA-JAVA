package com.company;

public class Solution {

    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight >= rightHeight) {
            return 1 + leftHeight;
        } else
            return 1 + rightHeight;


    }
    
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return false;
        }

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

}
