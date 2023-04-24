package com.aditya.leetcode.graphs;

public class NumberOfIslands {
    private void dfs(int i, int j, int[][] visited, char[][] grid, int m, int n){
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] == 1 || grid[i][j] == '0')
            return;
        visited[i][j] = 1;
        dfs(i-1, j, visited, grid, m, n);
        dfs(i, j-1, visited, grid, m, n);
        dfs(i+1, j, visited, grid, m, n);
        dfs(i, j+1, visited, grid, m, n);
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;        //rows
        int n = grid[0].length;     //columns
        int[][] visited = new int[m][n];
        int count = 0;
        for(int i=0; i<m; ++i){
            for(int j=0; j<grid[0].length; ++j){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    dfs(i, j, visited, grid, m, n);
                }
            }
        }
        return count;
    }
}
