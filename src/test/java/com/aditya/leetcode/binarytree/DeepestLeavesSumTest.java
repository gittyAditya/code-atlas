package com.aditya.leetcode.binarytree;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSumTest {

    private DeepestLeavesSum deepestLeavesSum;
    private TreeNode treeStructure;

    @BeforeEach
    public void setUp() {
        deepestLeavesSum = new DeepestLeavesSum();
        buildTreeStructure();
    }

    private void buildTreeStructure(){
        // create the tree: [1,2,3,4,5,null,6,7,null,null,null,null,8]
        TreeNode root = new TreeNode().setVal(1);
        root.setLeft(new TreeNode().setVal(2));
        root.setRight(new TreeNode().setVal(3));
        root.getLeft().setLeft(new TreeNode().setVal(4));
        root.getLeft().setRight(new TreeNode().setVal(5));
        root.getRight().setRight(new TreeNode().setVal(6));
        root.getLeft().getLeft().setLeft(new TreeNode().setVal(7));
        root.getRight().getRight().setRight(new TreeNode().setVal(8));

        this.treeStructure = root;
    }

    @Test
    public void testDeepestLeavesSum() {

        int expected = 15; // sum of deepest leaves: 7 + 8
        int actual = deepestLeavesSum.deepestLeavesSum(treeStructure);
        Assertions.assertEquals(expected, actual);
    }
}
