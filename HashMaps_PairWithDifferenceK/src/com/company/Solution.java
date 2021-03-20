package com.company;

import java.util.HashMap;

public class Solution {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        //Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i + k)) {
                for (int j = 0; j < map.get(i + k); j++) {
                    count++;
                }
            }
            if (map.containsKey(i - k)) {
                for (int j = 0; j < map.get(i - k); j++) {
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
