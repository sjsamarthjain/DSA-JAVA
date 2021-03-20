package com.company;

import java.util.HashMap;

public class Solution {
    public static int PairSum(int[] input, int size) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : input) {

            if (map.containsKey(-i)) {
                for (int j = 0; j < map.get(-i); j++) {
                    count++;
                }
            }

            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return count;
    }
}
