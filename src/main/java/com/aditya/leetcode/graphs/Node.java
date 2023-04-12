package com.aditya.leetcode.graphs;

import java.util.List;

// Definition for a Node.
public class Node {
    private int val;
    private List<Node> neighbors;

    public int getVal() {
        return val;
    }

    public Node setVal(int val) {
        this.val = val;
        return this;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public Node setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
        return this;
    }
}