package com.aditya.leetcode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumBinaryTreeTest {

    private MaximumBinaryTree maxTree;
    private int[] nums;

    @BeforeEach
    public void setUp(){
        maxTree = new MaximumBinaryTree();
        setTreeArray();
    }

    private void setTreeArray(){
        //input array
        int[] tree = {3,2,1,6,0,5};
        this.nums = tree;
    }

    @Test
    public void TestMaxTree(){

        //expected tree after output: [6,3,5,null,2,0,null,null,1]
        TreeNode expected = new TreeNode().setVal(6);
        expected.setLeft(new TreeNode().setVal(3));
        expected.setRight(new TreeNode().setVal(5));
        expected.getLeft().setRight(new TreeNode().setVal(2));
        expected.getRight().setLeft(new TreeNode().setVal(0));
        expected.getLeft().getRight().setRight(new TreeNode().setVal(1));

        TreeNode actual = maxTree.constructMaximumBinaryTree(nums);
        assertTreesEquals(expected, actual);
    }

    private void assertTreesEquals(TreeNode expected, TreeNode actual){
        if (expected == null) {
            Assertions.assertNull(actual);
        } else {
            Assertions.assertNotNull(actual);
            Assertions.assertEquals(expected.getVal(), actual.getVal());
            assertTreesEquals(expected.getLeft(), actual.getLeft());
            assertTreesEquals(expected.getRight(), actual.getRight());
            assertTreesEquals(expected.getLeft().getRight(), actual.getLeft().getRight());
            assertTreesEquals(expected.getRight().getLeft(), actual.getRight().getLeft());
            assertTreesEquals(expected.getLeft().getRight().getRight(), actual.getLeft().getRight().getRight());
        }
    }
}
