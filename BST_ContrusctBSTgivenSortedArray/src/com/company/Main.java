package com.company;

public class Main {

    public static void main(String[] args) {
	//Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array.
        // Return the root of constructed BST.
        //Note: If array size is even, take first mid as root.
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

public class Solution {

    public  BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr,0,n-1);
    }

    public BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){

        if(si>ei) {
            return null;
        }
        int mid = (si+ei)/2;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = SortedArrayToBST(arr,si,mid-1);
        root.right = SortedArrayToBST(arr, mid+1, ei);
        return root;



    }
}}