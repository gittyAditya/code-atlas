package com.aditya.leetcode.graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void testAllPathsSourceTarget() {
        AllPathsFromSourceToTarget solver = new AllPathsFromSourceToTarget();

        int[][] graph = {{1,2},{3},{3},{}}; // example graph from LeetCode problem 797
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0,1,3),
                Arrays.asList(0,2,3)
        );
        List<List<Integer>> actual = solver.allPathsSourceTarget(graph);

        assertEquals(expected, actual);
    }

}
