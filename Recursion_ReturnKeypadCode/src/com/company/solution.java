package com.company;

public class solution {

    // Return a string array that contains all the possible strings
    public static String[] keypad(int n) {
        // Write your code here
        if (n <= 1) {
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = keypad(n / 10);
        String[] options = helper(n % 10);
        String[] ans = new String[options.length * smallAns.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            for (int j = 0; j < options.length; j++) {
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        return ans;

    }

    public static String[] helper(int n) {
        switch (n) {
            case 2:
                String[] opt = {"a", "b", "c"};
                return opt;

            case 3:
                String[] opt1 = {"d", "e", "f"};
                return opt1;

            case 4:
                String[] opt2 = {"g", "h", "i"};
                return opt2;

            case 5:
                String[] opt3 = {"j", "k", "l"};
                return opt3;

            case 6:
                String[] opt4 = {"m", "n", "o"};
                return opt4;

            case 7:
                String[] opt5 = {"p", "q", "r", "s"};
                return opt5;

            case 8:
                String[] opt6 = {"t", "u", "v"};
                return opt6;

            case 9:
                String[] opt7 = {"w", "x", "y", "z"};
                return opt7;

        }
        String[] op = {""};
        return op;
    }

}
