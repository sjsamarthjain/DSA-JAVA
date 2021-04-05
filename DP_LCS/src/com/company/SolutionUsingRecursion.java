package com.company;

public class SolutionUsingRecursion {

    public static int lcs(String s, String t) {
        //Your code goes here
        return better(s, t, 0, 0);
    }

    public static int better(String s1, String s2, int si1, int si2) {
        if (si1 > s1.length() - 1 || si2 > s2.length() - 1) {
            return 0;
        }

        if (s1.charAt(si1) == (s2.charAt(si2))) {
            return 1 + better(s1, s2, si1 + 1, si2 + 1);
        } else {
            int ans1 = better(s1, s2, si1, si2 + 1);
            int ans2 = better(s1, s2, si1 + 1, si2);
            return Math.max(ans1, ans2);
        }

    }

}
