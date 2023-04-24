package com.aditya.leetcode.graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberOfIslandsTest {
    @Test
    void testNumIslands1() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIslands obj = new NumberOfIslands();
        assertEquals(1, obj.numIslands(grid));
    }

    @Test
    void testNumIslands2() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        NumberOfIslands obj = new NumberOfIslands();
        assertEquals(3, obj.numIslands(grid));
    }
}
