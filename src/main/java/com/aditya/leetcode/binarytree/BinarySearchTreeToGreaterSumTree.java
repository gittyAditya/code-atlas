package com.aditya.leetcode.binarytree;

public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null)
            return root;
        bstToGst(root.getRight());
        sum += root.getVal();
        root.setVal(sum);
        bstToGst(root.getLeft());
        return root;
    }
}
