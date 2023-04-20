package com.aditya.leetcode.binarytree;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }
}
