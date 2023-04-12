package com.aditya.leetcode.linkedlist;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode backNode = head;
        ListNode frontNode = head.getNext();
        int sum = 0;
        while(frontNode != null){
            sum += frontNode.getVal();
            if(frontNode.getVal() == 0){
                backNode.setVal(sum);
                sum = 0;
                if(frontNode.getNext() != null)
                    backNode = backNode.getNext();
            }
            frontNode = frontNode.getNext();
        }
        backNode.setNext(null);
        return head;
    }
}