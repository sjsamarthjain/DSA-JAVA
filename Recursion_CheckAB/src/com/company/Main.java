package com.company;
import java.util.Scanner;

public class Main {
//Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'
//If all the rules are followed by the given string, return true otherwise return false.
    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(Solution.checkAB(input));

    }
}

