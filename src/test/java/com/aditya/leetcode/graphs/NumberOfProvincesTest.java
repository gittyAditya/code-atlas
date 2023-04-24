package com.aditya.leetcode.graphs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfProvincesTest {

    @Test
    void testFindCircleNum() {
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

        // Test case 1
        int[][] isConnected1 = {{1,1,0}, {1,1,0}, {0,0,1}};
        int expected1 = 2;
        int actual1 = numberOfProvinces.findCircleNum(isConnected1);
        assertEquals(expected1, actual1);

        // Test case 2
        int[][] isConnected2 = {{1,0,0}, {0,1,0}, {0,0,1}};
        int expected2 = 3;
        int actual2 = numberOfProvinces.findCircleNum(isConnected2);
        assertEquals(expected2, actual2);

        // Test case 3
        int[][] isConnected3 = {{1}};
        int expected3 = 1;
        int actual3 = numberOfProvinces.findCircleNum(isConnected3);
        assertEquals(expected3, actual3);
    }

}

