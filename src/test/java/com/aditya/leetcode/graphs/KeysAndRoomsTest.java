package com.aditya.leetcode.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arrays.asList() -> Mutable // List.of() -> Immutable

public class KeysAndRoomsTest {

    @Test
    public void testCanVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));  // keys in room 0 can unlock room 1
        rooms.add(Arrays.asList(2));  // keys in room 1 can unlock room 2
        rooms.add(Arrays.asList(3));  // keys in room 2 can unlock room 3
        rooms.add(Arrays.asList());   // no keys in room 3

        KeysAndRooms solver = new KeysAndRooms();
        boolean actual = solver.canVisitAllRooms(rooms);
        Assertions.assertTrue(actual, "Expected to be able to visit all rooms.");
    }

    @Test
    public void testCannotVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));     // keys in room 0 can unlock room 1 and room 3
        rooms.add(Arrays.asList(3, 0, 1));  // keys in room 1 can unlock room 3 and room 0 and room 1 itself
        rooms.add(Arrays.asList(2));        // keys in room 2 can unlock room 2 itself
        rooms.add(Arrays.asList(0));        // keys in room 3 can unlock room 0

        KeysAndRooms solver = new KeysAndRooms();
        boolean actual = solver.canVisitAllRooms(rooms);
        Assertions.assertFalse(actual, "Expected to be unable to visit all rooms.");
    }
}
