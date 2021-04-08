package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static int numConnected(int[][] adjMatrix, int num) {
        int ans = 0;
        boolean visited[] = new boolean[adjMatrix.length];
        for (int i = 0; i < adjMatrix.length; i++) {
            if (!visited[i]) {
                ans++;
                printHelper(adjMatrix, i, visited);
            }
        }

        return ans;


    }

    public static void printHelper(int edges[][], int sv, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while (q.size() != 0) {
            int firstelem = q.remove();
            // System.out.print(firstelem+" ");
            visited[sv] = true;
            for (int i = 0; i < edges.length; i++) {
                if (edges[firstelem][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }


}
