package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);
        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.print(front.data + ":");
            if (front.left != null) {
                System.out.print("L:" + front.left.data + ",");
                pendingChildren.add(front.left);
            } else {
                System.out.print("L:-1" + ",");
            }
            if (front.right != null) {
                System.out.print("R:" + front.right.data);
                pendingChildren.add(front.right);
            } else {
                System.out.print("R:-1");
            }
            System.out.println();
        }
    }

}
