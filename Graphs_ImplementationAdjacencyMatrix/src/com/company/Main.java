package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void dftraversal(int[][] adjMatrix, int currentVertex,boolean[] visited){
        visited[currentVertex]=true;
        System.out.print(currentVertex+" ");
        for(int i=0;i<adjMatrix.length;i++){
            if(adjMatrix[currentVertex][i]==1 && visited[i]==false){
                // i is neighbour of current vertex
                dftraversal(adjMatrix,i,visited);
            }
        }
    }

    public static void dftraversal(int[][] adjMatrix){

        boolean visited[] = new boolean[adjMatrix.length];
        for(int i=0;i< adjMatrix.length;i++){
            if(!visited[i]){
                dftraversal(adjMatrix,i,visited);
                System.out.println();
            }
        }
    }

    public static void bftraversal(int[][] adjMatrix){
        boolean visited[] = new boolean[adjMatrix.length];
        for(int i=0; i< adjMatrix.length; i++){
            if(!visited[i]){
                printHelper(adjMatrix, i, visited);
            }
        }
    }
    public static void printHelper(int edges[][], int sv,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while(q.size()!=0){
            int firstelem = q.remove();
            System.out.print(firstelem+" ");
            visited[sv] = true;
            for(int i=0; i<edges.length; i++){
                if(edges[firstelem][i]==1 && !visited[i]){
                    q.add(i); 
                    visited[i]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        //Vertices=n
        int n = s.nextInt();
        //Edges = e
        int e = s.nextInt();

        int adjMatrix[][] = new int[n][n];
        //Take edges and fill matrix
        for(int i=0;i<e;i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v2]=1;
        }

        dftraversal(adjMatrix);
        bftraversal(adjMatrix);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(adjMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
