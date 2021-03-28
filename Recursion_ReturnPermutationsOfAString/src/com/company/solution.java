package com.company;

public class solution {

    public static String[] permutationOfString(String str) {
        // Write your code here
        if (str.length() == 0) {
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = permutationOfString(str.substring(1));
        String[] ans = new String[smallAns.length * str.length()];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                ans[k] = smallAns[i].substring(0, j) + str.charAt(0) + smallAns[i].substring(j);
                k++;
            }
        }
        return ans;

    }

}
