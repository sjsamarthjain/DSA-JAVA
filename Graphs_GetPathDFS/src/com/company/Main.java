package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path from
        // v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
        //Find the path using DFS and print the first path that you encountered.
        //Note:
        //1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
        //2. E is the number of edges present in graph G.
        //3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
        //4. Save the input graph in Adjacency Matrix.
        //Input Format :
        //The first line of input contains two integers, that denote the value of V and E.
        //Each of the following E lines contains two integers, that denote that there exists an edge between
        // vertex 'a' and 'b'.
        //The following line contain two integers, that denote the value of v1 and v2
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
        int start=s.nextInt();
        int end=s.nextInt();
        String ans="";
        boolean visited[]=new boolean[edges.length];
        help(edges,visited,ans,start,end);
    }

    public static void help(int edges[][],boolean visited[],String ans,int start,int end){
        if(start==end){
            ans=start+" "+ans;
            System.out.print(ans);
            System.exit(0);
        }
        visited[start]=true;
        ans=start+" "+ans;
        int n=edges.length;
        for(int j=0;j<n;j++){
            if(edges[start][j]==1&&!visited[j]){
                help(edges,visited,ans,j,end);
            }
        }
    }
}
