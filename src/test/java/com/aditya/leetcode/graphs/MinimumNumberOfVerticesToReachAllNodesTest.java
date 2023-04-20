package com.aditya.leetcode.graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MinimumNumberOfVerticesToReachAllNodesTest {

    @Test
    public void testFindSmallestSetOfVertices() {
        MinimumNumberOfVerticesToReachAllNodes solution = new MinimumNumberOfVerticesToReachAllNodes();

        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0, 1));
        edges.add(Arrays.asList(0, 2));
        edges.add(Arrays.asList(2, 5));
        edges.add(Arrays.asList(3, 4));
        edges.add(Arrays.asList(4, 2));

        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> actual = solution.findSmallestSetOfVertices(6, edges);

        assertEquals(expected, actual);
    }

}
