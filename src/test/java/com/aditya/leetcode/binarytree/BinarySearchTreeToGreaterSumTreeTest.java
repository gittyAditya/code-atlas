package com.aditya.leetcode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeToGreaterSumTreeTest {

    private BinarySearchTreeToGreaterSumTree bstToGst;
    private TreeNode treeStructure;

    @BeforeEach
    public void setUp() {
        bstToGst = new BinarySearchTreeToGreaterSumTree();
        buildTreeStructure();
    }

    private void buildTreeStructure(){
        // create the tree: [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        TreeNode root = new TreeNode().setVal(4);
        root.setLeft(new TreeNode().setVal(1));
        root.setRight(new TreeNode().setVal(6));
        root.getLeft().setLeft(new TreeNode().setVal(0));
        root.getLeft().setRight(new TreeNode().setVal(2));
        root.getRight().setLeft(new TreeNode().setVal(5));
        root.getRight().setRight(new TreeNode().setVal(7));
        root.getLeft().getRight().setRight(new TreeNode().setVal(3));
        root.getRight().getRight().setRight(new TreeNode().setVal(8));

        this.treeStructure = root;
    }

    @Test
    public void testBstToGst() {

        TreeNode expected = new TreeNode().setVal(30); // expected tree after conversion
        expected.setLeft(new TreeNode().setVal(36));
        expected.setRight(new TreeNode().setVal(21));
        expected.getLeft().setLeft(new TreeNode().setVal(36));
        expected.getLeft().setRight(new TreeNode().setVal(35));
        expected.getRight().setLeft(new TreeNode().setVal(26));
        expected.getRight().setRight(new TreeNode().setVal(15));
        expected.getLeft().getRight().setRight(new TreeNode().setVal(33));
        expected.getRight().getRight().setRight(new TreeNode().setVal(8));

        TreeNode actual = bstToGst.bstToGst(treeStructure);
        assertTreesEquals(expected, actual);
    }

    private void assertTreesEquals(TreeNode expected, TreeNode actual) {
        if (expected == null) {
            Assertions.assertNull(actual);
        } else {
            Assertions.assertNotNull(actual);
            Assertions.assertEquals(expected.getVal(), actual.getVal());
            assertTreesEquals(expected.getLeft(), actual.getLeft());
            assertTreesEquals(expected.getRight(), actual.getRight());
        }
    }
}
