package com.company;

import java.util.Stack;

public class Solution {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {

                    if (stack.isEmpty()) {
                        return false;
                    }

                if (pair(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }

            }


        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;

    }


    public static char pair(char c) {
        if (c == '}') {
            return '{';
        }
        if (c == ')') {
            return '(';
        }
        if (c == ']') {
            return '[';
        }
        return '\0';
    }
}
