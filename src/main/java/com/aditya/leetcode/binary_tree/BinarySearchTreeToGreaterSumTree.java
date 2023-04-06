package com.aditya.leetcode.binary_tree;

public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null)
            return root;
        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }
}
