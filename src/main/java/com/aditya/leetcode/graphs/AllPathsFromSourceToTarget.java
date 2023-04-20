package com.aditya.leetcode.graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {

    private void dfs(int node, int[][] graph, List<Integer> path,  List<List<Integer>> paths){
        path.add(node);
        if(node == graph.length - 1)
            paths.add(new ArrayList<>(path));
        else
            for(int it: graph[node])
                dfs(it, graph, path, paths);
        path.remove(path.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, graph, path, paths);
        return paths;
    }

}
