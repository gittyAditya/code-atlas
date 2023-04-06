package com.aditya.leetcode.binary_tree;

public class InvertBinaryTree0226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode node = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = node;
        return root;
    }
}
