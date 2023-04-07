package com.aditya.leetcode.linked_list;

//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode back_node = head;
        ListNode front_node = head.next;
        int sum = 0;
        while(front_node != null){
            sum += front_node.val;
            if(front_node.val == 0){
                back_node.val = sum;
                sum = 0;
                if(front_node.next != null)
                    back_node = back_node.next;
            }
            front_node = front_node.next;
        }
        back_node.next = null;
        return head;
    }
}