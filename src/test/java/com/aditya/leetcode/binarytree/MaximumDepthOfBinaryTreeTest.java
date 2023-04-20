package com.aditya.leetcode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() {
        TreeNode root = new TreeNode().setVal(3);
        root.setLeft(new TreeNode().setVal(9));
        TreeNode rightSubtree = new TreeNode().setVal(20);
        rightSubtree.setLeft(new TreeNode().setVal(15));
        rightSubtree.setRight(new TreeNode().setVal(7));
        root.setRight(rightSubtree);

        MaximumDepthOfBinaryTree solver = new MaximumDepthOfBinaryTree();
        int actualDepth = solver.maxDepth(root);
        Assertions.assertEquals(3, actualDepth, "Expected max depth is 3 for the given tree.");
    }
}

