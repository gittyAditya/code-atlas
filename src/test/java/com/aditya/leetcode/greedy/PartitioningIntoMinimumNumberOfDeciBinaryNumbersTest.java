package com.aditya.leetcode.greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    @Test
    public void testMinPartitionsWithTestCase1() {
        String n = "32";
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        int result = solution.minPartitions(n);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void testMinPartitionsWithTestCase2() {
        String n = "84397";
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        int result = solution.minPartitions(n);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    public void testMinPartitionsWithTestCase3() {
        String n = "938473204923904230948053287";
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        int result = solution.minPartitions(n);
        int expected = 9;
        assertEquals(expected, result);
    }
}
