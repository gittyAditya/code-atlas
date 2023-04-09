package com.aditya.leetcode.graphs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class CloneGraphTest {
    @Test
    void testCloneGraph() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        CloneGraph cg = new CloneGraph();
        Node clonedNode = cg.cloneGraph(n1);

        Map<Integer, Node> visitedNodes = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(clonedNode);
        visitedNodes.put(clonedNode.val, clonedNode);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            assertEquals(curr.val, visitedNodes.get(curr.val).val);
            assertEquals(curr.neighbors.size(), visitedNodes.get(curr.val).neighbors.size());

            for (int i = 0; i < curr.neighbors.size(); i++) {
                Node clonedNeighbor = curr.neighbors.get(i);
                Node originalNeighbor = visitedNodes.get(curr.neighbors.get(i).val);

                if (originalNeighbor == null) {
                    fail("Cloned graph is not identical to original graph.");
                }

                assertTrue(clonedNeighbor == visitedNodes.get(clonedNeighbor.val));
                if (!visitedNodes.containsKey(clonedNeighbor.val)) {
                    visitedNodes.put(clonedNeighbor.val, clonedNeighbor);
                    queue.add(clonedNeighbor);
                }
            }
        }
    }
}

