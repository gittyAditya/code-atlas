package com.aditya.leetcode.graphs;

import java.util.List;

public class KeysAndRooms {
    private void dfs(int node, List<List<Integer>> rooms, int[] visited){
        visited[node] = 1;
        for(int it: rooms.get(node))
            if(visited[it] != 1)
                dfs(it, rooms, visited);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        int[] visited = new int[size];
        dfs(0, rooms, visited);
        for(int it: visited)
            if(it == 0)
                return false;
        return true;
    }
}
