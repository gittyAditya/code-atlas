package com.aditya.leetcode.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSum1302Test {

    private DeepestLeavesSum1302 deepestLeavesSum;

    @BeforeEach
    public void setUp() {
        deepestLeavesSum = new DeepestLeavesSum1302();
    }

    @Test
    public void testDeepestLeavesSum() {
        // create the tree: [1,2,3,4,5,null,6,7,null,null,null,null,8]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        int expected = 15; // sum of deepest leaves: 7 + 8
        int actual = deepestLeavesSum.deepestLeavesSum(root);
        Assertions.assertEquals(expected, actual);
    }
}
