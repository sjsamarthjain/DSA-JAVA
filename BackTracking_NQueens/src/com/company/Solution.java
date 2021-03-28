package com.company;

public class Solution {


    public static void placeNQueens(int n) {
        Nqueen(new boolean[n][n], 0);
    }

    public static void Nqueen(boolean board[][], int row) {

        //Check if reached destination and print accordingly
        if (row == board.length) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    if (board[i][j] == false) {
                        System.out.print(0 + " ");
                    } else {
                        System.out.print(1 + " ");
                    }
                }
            }
            System.out.println();
            return;
        }


        for (int i = 0; i < board[row].length; i++) {
            if (canBePlaced(board, row, i)) {
                board[row][i] = true;
                Nqueen(board, row + 1);
                board[row][i] = false;
            }
        }

    }

    //Function to check whether placing is possible at given cell
    public static boolean canBePlaced(boolean board[][], int r, int c) {

        int i = r;
        while (i >= 0) {
            if (board[i--][c])
                return false;
        }

        // i = c;
        // while(i>=0){
        //     if(board[r][i--])
        //         return false;
        // }

        i = r;
        int j = c;
        while (i >= 0 && j >= 0) {
            if (board[i--][j--])
                return false;
        }
        i = r;
        j = c;
        while (i >= 0 && j < board[i].length) {
            if (board[i--][j++])
                return false;
        }

        return true;
    }

}
