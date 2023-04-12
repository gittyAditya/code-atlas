package com.aditya.leetcode.binarytree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode node = invertTree(root.getRight());
        root.setRight(invertTree(root.getLeft()));
        root.setLeft(node);
        return root;
    }
}
