package com.company;

import java.util.Stack;

public class Solution {

    public static int countBracketReversals(String str) {
        if (str.length() % 2 != 0) {
            return -1;
        }


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        int count = 0;
        while (!stack.isEmpty()) {
            char c1 = stack.pop();
            char c2 = stack.pop();
            if (c1 == c2) {
                count++;
            } else {
                count += 2;
            }
        }
        return count;
    }

}
