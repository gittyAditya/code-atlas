package com.aditya.leetcode.binarytree;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode flatRight = root.getRight();
        root.setRight(root.getLeft());
        flatten(root.getLeft());
        root.setLeft(null);
        flatten(flatRight);

        TreeNode current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        current.setRight(flatRight);
    }
}
