package com.aditya.leetcode.graphs;
// --Visit Again -- Learn More--
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class CloneGraphTest {

    @Test
    public void testCloneGraph() {
        Node n1 = new Node().setVal(1);
        Node n2 = new Node().setVal(2);
        Node n3 = new Node().setVal(3);
        Node n4 = new Node().setVal(4);
        n1.getNeighbors().add(n2);
        n1.getNeighbors().add(n4);
        n2.getNeighbors().add(n1);
        n2.getNeighbors().add(n3);
        n3.getNeighbors().add(n2);
        n3.getNeighbors().add(n4);
        n4.getNeighbors().add(n1);
        n4.getNeighbors().add(n3);

        CloneGraph cg = new CloneGraph();
        Node clonedNode = cg.cloneGraph(n1);

        Map<Integer, Node> visitedNodes = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(clonedNode);
        visitedNodes.put(clonedNode.getVal(), clonedNode);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            assertEquals(curr.getVal(), visitedNodes.get(curr.getVal()).getVal());
            assertEquals(curr.getNeighbors().size(), visitedNodes.get(curr.getVal()).getNeighbors().size());

            for (int i = 0; i < curr.getNeighbors().size(); i++) {
                Node clonedNeighbor = curr.getNeighbors().get(i);
                Node originalNeighbor = visitedNodes.get(curr.getNeighbors().get(i).getVal());

                if (originalNeighbor == null) {
                    fail("Cloned graph is not identical to original graph.");
                }

                assertTrue(clonedNeighbor == visitedNodes.get(clonedNeighbor.getVal()));
                if (!visitedNodes.containsKey(clonedNeighbor.getVal())) {
                    visitedNodes.put(clonedNeighbor.getVal(), clonedNeighbor);
                    queue.add(clonedNeighbor);
                }
            }
        }
    }
}

