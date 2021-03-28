package com.company;

public class Solution {

    public static void ratInAMaze(int maze[][]) {

        int n = maze.length;
        int path[][] = new int[n][n];
        printAllPaths(maze, 0, 0, path);

    }

    public static void printAllPaths(int maze[][], int i, int j, int path[][]) {

        int n = maze.length;
        //Check if i,j cell is valid
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        //Include current cell in path
        path[i][j] = 1;

        //Destination Cell
        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        //Explore in all directions
        //top
        printAllPaths(maze, i - 1, j, path);
        //right
        printAllPaths(maze, i, j + 1, path);
        //down
        printAllPaths(maze, i + 1, j, path);
        //left
        printAllPaths(maze, i, j - 1, path);

        path[i][j] = 0;
    }

}
