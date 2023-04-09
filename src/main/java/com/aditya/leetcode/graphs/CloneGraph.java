package com.aditya.leetcode.graphs;

import java.util.List;
import java.util.ArrayList;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
    Node[] visited;
    public Node DFS(Node node){
        if(visited[node.val] != null)
            return visited[node.val];
        visited[node.val] = new Node(node.val);
        for(Node n: node.neighbors)
            visited[node.val].neighbors.add(DFS(n));
        return visited[node.val];
    }
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        visited = new Node[101];
        return DFS(node);
    }
}
