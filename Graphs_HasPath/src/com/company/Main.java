package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any
        // path between them or not. Print true if the path exists and false otherwise.
        //Note:
        //1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
        //2. E is the number of edges present in graph G.
        //Input Format :
        //The first line of input contains two integers, that denote the value of V and E.
        //Each of the following E lines contains two integers, that denote that there exists an edge between
        // vertex 'a' and 'b'.
        //The following line contain two integers, that denote the value of v1 and v2.
        //Output Format :
        //The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int edges[][]=new int[n][n];

        for(int i=0;i<e;i++){
            // fv=first vertice
            // sv=second vertice
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int v1 = s.nextInt();
        int v2= s.nextInt();
        boolean visited[]= new boolean[edges.length];
        printhelper(edges,v1,v2,visited);
    }
    public static void printhelper(int edges[][],int v1,int v2,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n=edges.length;
        while(q.size()!=0){
            int removed=q.remove();
            visited[removed]=true;
            if(removed==v2){
                System.out.print("true");
                return;
            }
            for(int i=0;i<n;i++){
                if(edges[removed][i]==1&&!visited[i]){
                    visited[i] =true;
                    q.add(i);
                }
            }
        }
        System.out.print("false");
    }
}
