package com.aditya.leetcode.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    private InvertBinaryTree invertTree;
    private TreeNode treeStructure;

    @BeforeEach
    public void setUp() {
        invertTree = new InvertBinaryTree();
        buildTreeStructure();
    }

    private void buildTreeStructure(){
        // create the tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode().setVal(4);
        root.setLeft(new TreeNode().setVal(2));
        root.setRight(new TreeNode().setVal(7));
        root.getLeft().setLeft(new TreeNode().setVal(1));
        root.getLeft().setRight(new TreeNode().setVal(3));
        root.getRight().setLeft(new TreeNode().setVal(6));
        root.getRight().setRight(new TreeNode().setVal(9));

        this.treeStructure = root;
    }

    @Test
    public void testInvertTree() {

        // expected tree after inversion: [4,7,2,9,6,3,1]
        TreeNode expected = new TreeNode().setVal(4);
        expected.setLeft(new TreeNode().setVal(7));
        expected.setRight(new TreeNode().setVal(2));
        expected.getLeft().setLeft(new TreeNode().setVal(9));
        expected.getLeft().setRight(new TreeNode().setVal(6));
        expected.getRight().setLeft(new TreeNode().setVal(3));
        expected.getRight().setRight(new TreeNode().setVal(1));

        TreeNode actual = invertTree.invertTree(treeStructure);
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
