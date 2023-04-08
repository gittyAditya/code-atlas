package com.aditya.leetcode.binary_tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumBinaryTreeTest {

    private MaximumBinaryTree maxTree;

    @BeforeEach
    public void setUp(){
        maxTree = new MaximumBinaryTree();
    }

    @Test
    public void TestMaxTree(){
        //input array
        int[] nums = {3,2,1,6,0,5};

        //expected tree after output: [6,3,5,null,2,0,null,null,1]
        TreeNode expected = new TreeNode(6);
        expected.left = new TreeNode(3);
        expected.right = new TreeNode(5);
        expected.left.right = new TreeNode(2);
        expected.right.left = new TreeNode(0);
        expected.left.right.right = new TreeNode(1);

        TreeNode actual = maxTree.constructMaximumBinaryTree(nums);
        assertTreesEquals(expected, actual);
    }

    private void assertTreesEquals(TreeNode expected, TreeNode actual){
        if (expected == null) {
            Assertions.assertNull(actual);
        } else {
            Assertions.assertNotNull(actual);
            Assertions.assertEquals(expected.val, actual.val);
            assertTreesEquals(expected.left, actual.left);
            assertTreesEquals(expected.right, actual.right);
            assertTreesEquals(expected.left.right, actual.left.right);
            assertTreesEquals(expected.right.left, actual.right.left);
            assertTreesEquals(expected.left.right.right, actual.left.right.right);
        }
    }
}
