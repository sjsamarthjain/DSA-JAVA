package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Given an undirected graph G(V,E), check if the graph G is connected graph or not.
        //Note:
        //1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
        //2. E is the number of edges present in graph G.
        //Input Format :
        //The first line of input contains two integers, that denote the value of V and E.
        //Each of the following E lines contains two integers, that denote that there exists an edge between
        // vertex a and b.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // total number of edges e
        int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        if(edges.length==0){
            System.out.print("true");
            return;
        }
        boolean visited[]=new boolean[edges.length];
        help(edges,visited,0);
        //now check if all elements is visited or not
        int length=visited.length;
        int i=0;
        while(i<visited.length){
            if(visited[i]!=true){
                System.out.print("false");
                System.exit(0);
            }
            i++;
        }
        System.out.print("true");
        System.exit(0);
    }
    public static void help(int edges[][],boolean visited[],int fv){
        visited[fv]=true;
        int n=edges.length;
        for(int j=0;j<n;j++){
            if(edges[fv][j]==1&&!visited[j]){
                help(edges,visited,j);
            }
        }
    }

}
