package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        return longestSequence(arr);
    }

    public static ArrayList<Integer> longestSequence(int[] a) {
        int maxcount = 0;
        int start = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(x);
        }

        for (int num : a) {

            if (!set.contains(num - 1)) {
                int count = 1;
                int st = num;
                while (set.contains(num + count)) {
                    count++;
                }

                if (count > maxcount) {
                    maxcount = count;
                    start = st;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(start + maxcount - 1);
        return ans;

    }
}
