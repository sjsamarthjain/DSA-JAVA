package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int fib = s.nextInt();
        int dp[] = new int[fib+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans =SolutionUsingMemoization.fibb(fib,dp);
        dp[fib]=ans;
        System.out.println(ans);
    }
}

