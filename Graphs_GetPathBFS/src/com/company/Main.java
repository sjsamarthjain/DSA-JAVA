package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    //Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path
    // from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
    //Find the path using BFS and print the shortest path available.
    //Note:
    //1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
    //2. E is the number of edges present in graph G.
    //3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
    //4. Save the input graph in Adjacency Matrix.
    //Input Format :
    //The first line of input contains two integers, that denote the value of V and E.
    //Each of the following E lines contains two integers, that denote that there exists an edge between
    // vertex a and b.
    //The following line contain two integers, that denote the value of v1 and v2.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // total number of edges e
        int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            // fv=first vertice
            // start=second vertice
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int start = s.nextInt();
        int end   = s.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean visited[]= new boolean[edges.length];
        getpath(edges,start,end,visited,map);
    }
    public static void getpath(int edges[][], int start, int end, boolean visited[], HashMap<Integer, Integer> map){
        Queue<Integer> pendingVertices = new LinkedList<>();
        pendingVertices.add(start);
        int n=edges.length;
        int gotIt=0;
        while(pendingVertices.size()!=0)
        {
            int currentVertex=pendingVertices.remove();
            visited[currentVertex]=true;
            //
            for(int i=0;i<n;i++)
            {
                if(edges[currentVertex][i]==1&&!visited[i])
                {
                    map.put(i,currentVertex);
                    visited[i]=true;
                    pendingVertices.add(i);
                    if(i==end)
                    {
                        gotIt=1;
                    }
                    if(gotIt==1)
                    {
                        break;
                    }
                }
                if(gotIt==1)
                {
                    break;
                }
            }
        }
        if(gotIt==1)
        {
            int last=map.get(end);
            System.out.print(end+" ");
            while(last!=end)
            {
                System.out.print(last+" ");
                if(map.get(last)!=null)
                    last=map.get(last);
                else {
                    break;
                }
            }
        }
    }
}
