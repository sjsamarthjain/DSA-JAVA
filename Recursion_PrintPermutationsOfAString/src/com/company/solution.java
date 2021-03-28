package com.company;

public class solution {

    public static void permutations(String str) {
        permutations(str, "");
    }

    public static void permutations(String str, String output) {
        if (str.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permutations(str.substring(0, i) + str.substring(i + 1), output + str.charAt(i));
        }
    }
}
