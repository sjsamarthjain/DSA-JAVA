package com.company;
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        Solution.quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}



