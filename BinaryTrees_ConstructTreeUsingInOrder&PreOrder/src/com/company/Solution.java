package com.company;

public class Solution {

    public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in) {
        //Your code goes here
        BinaryTreeNode<Integer> root = helper(pre,in,0,pre.length-1,0,in.length-1);
        return root;
    }

    public static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int siPre,int eiPre, int siIn,int eiIn){
        if(siPre>eiPre){
            return null;
        }
        int rootData = pre[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        int rootIndex=-1;
        for(int i=siIn;i<=eiIn;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }

        int siPreLeft = siPre+1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex-1;;
        int siInRight = rootIndex+1;
        int eiPreRight = eiPre;
        int eiInRight = eiIn;

        int leftSubtreeLength = eiInLeft - siInLeft + 1;

        int eiPreLeft=siPreLeft + leftSubtreeLength -1;
        int siPreRight=eiPreLeft+1;

        BinaryTreeNode<Integer> left = helper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> right = helper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);

        root.left=left;
        root.right=right;

        return root;
    }

}


















