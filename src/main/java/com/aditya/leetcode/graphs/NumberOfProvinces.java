package com.aditya.leetcode.graphs;

public class NumberOfProvinces {
    private void dfs(int i, int[] visited, int[][] isConnected, int size){
        visited[i] = 1;
        for(int j=0; j<size; ++j)
            if(visited[j] == 0 && isConnected[i][j] == 1)
                dfs(j, visited, isConnected, size);
    }

    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;
        int[] visited = new int[size];
        int count = 0;
        for(int i=0; i<size; ++i){
            if(visited[i] == 0){
                count++;
                dfs(i, visited, isConnected, size);
            }
        }
        return count;
    }
}
