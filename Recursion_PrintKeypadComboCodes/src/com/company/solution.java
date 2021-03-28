package com.company;

public class solution {

    public static void printKeypad(int n) {

        printKeypadBetter(n, "");
    }

    public static void printKeypadBetter(int n, String outputSoFar) {

        if (n == 0) {
            System.out.println(outputSoFar);
            return;
        }

        String[] options = helper(n % 10);
        for (int i = 0; i < options.length; i++) {
            printKeypadBetter(n / 10, options[i] + outputSoFar);
        }
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
