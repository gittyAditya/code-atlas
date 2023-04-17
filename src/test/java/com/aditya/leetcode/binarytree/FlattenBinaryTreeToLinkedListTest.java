package com.aditya.leetcode.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlattenBinaryTreeToLinkedListTest {

    private FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList;
    private TreeNode root;

    @BeforeEach
    public void setUp() {
        flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();
        /*
         * Create a binary tree for testing:
         *     1
         *    / \
         *   2   5
         *  / \   \
         * 3   4   6
         */
        root = new TreeNode().setVal(1);
        TreeNode node2 = new TreeNode().setVal(2);
        TreeNode node3 = new TreeNode().setVal(3);
        TreeNode node4 = new TreeNode().setVal(4);
        TreeNode node5 = new TreeNode().setVal(5);
        TreeNode node6 = new TreeNode().setVal(6);
        root.setLeft(node2);
        root.setRight(node5);
        node2.setLeft(node3);
        node2.setRight(node4);
        node5.setRight(node6);
    }

    @Test
    public void testFlattenBinaryTreeToLinkedList() {
        flattenBinaryTreeToLinkedList.flatten(root);

        // Expected result: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        TreeNode current = root;
        assertEquals(1, current.getVal());
        current = current.getRight();
        assertEquals(2, current.getVal());
        current = current.getRight();
        assertEquals(3, current.getVal());
        current = current.getRight();
        assertEquals(4, current.getVal());
        current = current.getRight();
        assertEquals(5, current.getVal());
        current = current.getRight();
        assertEquals(6, current.getVal());
        assertNull(current.getRight());
    }

    @Test
    public void testFlattenBinaryTreeToLinkedListWithNullRoot() {
        TreeNode nullRoot = null;
        flattenBinaryTreeToLinkedList.flatten(nullRoot); // Should not throw any exception
        assertNull(nullRoot);
    }

}
