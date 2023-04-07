package com.aditya.leetcode.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeNodesInBetweenZerosTest {

    private MergeNodesInBetweenZeros merger;

    @BeforeEach
    public void setUp(){
        merger = new MergeNodesInBetweenZeros();
    }

    @Test
    public void testMergeNodes(){
        // create the input Linked List: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(0);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        ListNode expectedNode1 = new ListNode(4);
        ListNode expectedNode2 = new ListNode(11);

        expectedNode1.next = expectedNode2;

        ListNode actual = merger.mergeNodes(node1);

        // Traverse both linked lists and compare each node
        while (expectedNode1 != null && actual != null) {
            Assertions.assertEquals(expectedNode1.val, actual.val);
            expectedNode1 = expectedNode1.next;
            actual = actual.next;
        }
        // Both linked lists should be exhausted at this point
        Assertions.assertNull(expectedNode1);
        Assertions.assertNull(actual);
    }
}
