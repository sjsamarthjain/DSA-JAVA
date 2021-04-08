package com.company;

public class Solution {

    int solve(String[] board, int n, int m) {
        char[][] graph = new char[n][m];
        boolean[][] visited = new boolean[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = board[i].charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = graph[i][j];

                if (c == 'C') {
                    visited[i][j] = true;
                    boolean ans = findPath(graph, visited, i, j, 1);

                    if (ans == true)
                        return 1;

                }
            }
        }

        return 0;

    }

    public static boolean findPath(char[][] graph, boolean[][] visited, int row, int col, int start) {
        String str = "CODINGNINJA";
        if (start == str.length())
            return true;
        int n = graph.length;
        int m = graph[0].length;
        //LinkedList <String> side =new LinkedList <String>();
        int[] side = new int[16];
        side = getNeighbour(row, col);

        for (int i = 0; i < 16; i = i + 2) {
            int cur_row = side[i];
            int cur_col = side[i + 1];
            if (cur_row < 0 || cur_col < 0 || cur_row >= n || cur_col >= m) {
                continue;
            } else {
                if (visited[cur_row][cur_col] == false && graph[cur_row][cur_col] == str.charAt(start)) {
                    visited[cur_row][cur_col] = true;
                    boolean ans = findPath(graph, visited, cur_row, cur_col, start + 1);
                    if (ans == true)
                        return true;
                    else
                        visited[cur_row][cur_col] = false;

                }
            }
        }
        return false;


    }

    public static int[] getNeighbour(int row, int col) {
        int ans[] = new int[16];
        //right
        ans[0] = row;
        ans[1] = col + 1;
        //down
        ans[2] = row + 1;
        ans[3] = col;
        //left
        ans[4] = row;
        ans[5] = col - 1;
        //up
        ans[6] = row - 1;
        ans[7] = col;
        //diagona;
        ans[8] = row + 1;
        ans[9] = col + 1;
        //diagonal
        ans[10] = row - 1;
        ans[11] = col - 1;

        //right diagonal
        ans[12] = row - 1;
        ans[13] = col + 1;

        //right dia
        ans[14] = row + 1;
        ans[15] = col - 1;

        return ans;
    }


}
