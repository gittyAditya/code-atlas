package com.aditya.leetcode.graphs;


public class CloneGraph {
    Node[] visited;
    public Node DFS(Node node){
        if(visited[node.getVal()] != null)
            return visited[node.getVal()];
        visited[node.getVal()] = new Node().setVal(node.getVal());
        for(Node n: node.getNeighbors())
            visited[node.getVal()].getNeighbors().add(DFS(n));
        return visited[node.getVal()];
    }
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        visited = new Node[101];
        return DFS(node);
    }
}
