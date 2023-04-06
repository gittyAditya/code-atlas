package com.aditya.leetcode.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeToGreaterSumTreeTest {

    private BinarySearchTreeToGreaterSumTree bstToGst;

    @BeforeEach
    public void setUp() {
        bstToGst = new BinarySearchTreeToGreaterSumTree();
    }

    @Test
    public void testBstToGst() {
        // create the tree: [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);

        TreeNode expected = new TreeNode(30); // expected tree after conversion
        expected.left = new TreeNode(36);
        expected.right = new TreeNode(21);
        expected.left.left = new TreeNode(36);
        expected.left.right = new TreeNode(35);
        expected.right.left = new TreeNode(26);
        expected.right.right = new TreeNode(15);
        expected.left.right.right = new TreeNode(33);
        expected.right.right.right = new TreeNode(8);

        TreeNode actual = bstToGst.bstToGst(root);
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
