package com.aditya.leetcode.binarytree;


// Definition for a binary tree node.
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public int getVal() {
        return val;
    }

    public TreeNode setVal(int val) {
        this.val = val;
        return this;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return this;
    }
}