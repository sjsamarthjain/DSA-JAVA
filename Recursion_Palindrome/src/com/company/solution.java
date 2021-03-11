package com.company;


public class solution {

    public static boolean isStringPalindrome(String input) {
        // Write your code here

        return checkPalindrome(input, 0);
    }

    public static boolean checkPalindrome(String str,int start) {

        if(start == str.length()) {
            return true;
        }
        if(str.charAt(start)!=str.charAt(str.length()-start-1)) {
            return false;
        }
        return checkPalindrome(str, start + 1);
    }
}
