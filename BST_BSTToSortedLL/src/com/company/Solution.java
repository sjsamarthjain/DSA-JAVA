package com.company;

public class Solution {

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return null;
        }
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(root.data);

        if (root.left == null && root.right == null) {
            return head;
        } else if (root.left != null && root.right != null) {
            LinkedListNode<Integer> leftList = constructLinkedList(root.left);
            LinkedListNode<Integer> temp = leftList;
            while (leftList.next != null) {
                leftList = leftList.next;
            }
            leftList.next = head;
            head.next = constructLinkedList(root.right);
            return temp;
        } else if (root.left != null) {
            LinkedListNode<Integer> rightList = constructLinkedList(root.left);
            LinkedListNode<Integer> temp = rightList;
            while (rightList.next != null) {
                rightList = rightList.next;
            }
            rightList.next = head;
            return temp;
        } else {
            head.next = constructLinkedList(root.right);
            return head;
        }


    }
}
