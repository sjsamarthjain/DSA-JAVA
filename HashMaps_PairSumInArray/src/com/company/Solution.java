package com.company;

import java.util.HashMap;

public class Solution {

    public static int pairSum(int[] arr, int sum) {
        //Your code goes here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairs = 0;
        for (int i : arr) {
            int rem = sum - i;
            if (map.containsKey(rem)) {
                pairs = pairs + map.get(rem);
            } else if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return pairs;
    }
}
