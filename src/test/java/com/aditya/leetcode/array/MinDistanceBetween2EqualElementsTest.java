package com.aditya.leetcode.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinDistanceBetween2EqualElementsTest {
    @Test
    public void testFindMinDistanceCase1(){
        MinDistanceBetween2EqualElements minDistance = new MinDistanceBetween2EqualElements();
        minDistance.setArray(new int[]{3, 5, 4, 6, 5, 3});
        int actual = minDistance.findMinDistance(minDistance.getArray());
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMinDistanceCase2(){
        MinDistanceBetween2EqualElements minDistance = new MinDistanceBetween2EqualElements();
        minDistance.setArray(new int[]{1, 2, 3, 2, 1});
        int actual = minDistance.findMinDistance(minDistance.getArray());
        int expected = 2;
        assertEquals(expected, actual);
    }

}
