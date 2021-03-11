package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution.towerOfHanoi(n, 'a', 'b', 'c');
    }
}



