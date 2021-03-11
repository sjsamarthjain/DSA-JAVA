package com.company;

public class Solution {

    public static void printAtDepthK(BinaryTreeNode<Integer> root,int k) {
        //Your code goes here
        if (root == null) {
            return;
        }

        if(k==0){
            System.out.println(root.data);
        }

        printAtDepthK(root.left,k-1);
        printAtDepthK(root.right,k-1);


    }
}
