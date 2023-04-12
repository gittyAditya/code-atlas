package com.aditya.leetcode.linkedlist;

//import java.util.Objects;

//Definition for singly-linked list.
public class ListNode {

        private int val;
        private ListNode next;


    public int getVal() {
        return val;
    }

    public ListNode setVal(int val) {
        this.val = val;
        return this;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ListNode listNode = (ListNode) o;
//        return val == listNode.val &&
//                Objects.equals(next, listNode.next);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(val, next);
//    }
//
//    @Override
//    public String toString() {
//        return "ListNode{" +
//                "val=" + val +
//                ", next=" + next +
//                '}';
//    }
}
