package com.aditya.leetcode.array;

import java.util.HashMap;

public class MinDistanceBetween2EqualElements {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int findMinDistance(int[] array){
        int ans = array.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<array.length; ++i){
            if(!map.containsKey(array[i]))
                map.put(array[i], i);
            else {
                ans = Math.min(ans, i - map.get(array[i]));
                map.put(array[i], i);
            }
        }
        return ans;
    }

}
