package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack any other queen on the chess board.
        // A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to print all such
        // configurations.
        //Input Format :
        //Line 1 : Integer N
        //Output Format :
        //One Line for every board configuration.
        //Every line will have N*N board elements printed row wise and are separated by space
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solution.placeNQueens(n);
    }
}


