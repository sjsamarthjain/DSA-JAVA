package com.company;

public class solution {

    // Return the updated string
    public static String addStars(String s) {
        // Write your code here

        if (s.length() == 1) {
            return s;
        }

        String smallAns = addStars(s.substring(1));

        if (smallAns.charAt(0) == s.charAt(0)) {
            return s.charAt(0) + "*" + smallAns;
        }
        return s.charAt(0) + smallAns;


    }
}
