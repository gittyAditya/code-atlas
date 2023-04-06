package com.aditya.leetcode.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertTree;

    @BeforeEach
    public void setUp() {
        invertTree = new InvertBinaryTree();
    }

    @Test
    public void testInvertTree() {
        // create the tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // expected tree after inversion: [4,7,2,9,6,3,1]
        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        TreeNode actual = invertTree.invertTree(root);
        assertTreesEquals(expected, actual);
    }

    private void assertTreesEquals(TreeNode expected, TreeNode actual) {
        if (expected == null) {
            Assertions.assertNull(actual);
        } else {
            Assertions.assertNotNull(actual);
            Assertions.assertEquals(expected.val, actual.val);
            assertTreesEquals(expected.left, actual.left);
            assertTreesEquals(expected.right, actual.right);
        }
    }
}
