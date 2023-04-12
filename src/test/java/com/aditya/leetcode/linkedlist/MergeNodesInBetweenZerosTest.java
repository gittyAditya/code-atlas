package com.aditya.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeNodesInBetweenZerosTest {

    private MergeNodesInBetweenZeros merger;
    private ListNode nodeStructure;

    @BeforeEach
    public void setUp(){
        merger = new MergeNodesInBetweenZeros();
        buildNodeStructure();
    }

    private void buildNodeStructure(){
        // create the input Linked List: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode node1 = new ListNode().setVal(0);
        ListNode node2 = new ListNode().setVal(3);
        ListNode node3 = new ListNode().setVal(1);
        ListNode node4 = new ListNode().setVal(0);
        ListNode node5 = new ListNode().setVal(4);
        ListNode node6 = new ListNode().setVal(5);
        ListNode node7 = new ListNode().setVal(2);
        ListNode node8 = new ListNode().setVal(0);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);

        this.nodeStructure = node1;
    }

    @Test
    public void testMergeNodes(){

        ListNode expectedNode1 = new ListNode().setVal(4);
        ListNode expectedNode2 = new ListNode().setVal(11);

        expectedNode1.setNext(expectedNode2);

        ListNode actual = merger.mergeNodes(nodeStructure);

        // Traverse both linked lists and compare each node
        while (expectedNode1 != null && actual != null) {
            Assertions.assertEquals(expectedNode1.getVal(), actual.getVal());
            expectedNode1 = expectedNode1.getNext();
            actual = actual.getNext();
        }
        // Both linked lists should be exhausted at this point
        Assertions.assertNull(expectedNode1);
        Assertions.assertNull(actual);
    }
}
