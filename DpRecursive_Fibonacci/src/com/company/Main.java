package com.company;

import java.util.Scanner;

public class Main {

    public static int fibb(int n, int[] dp){
        if(n==1 || n==0){
            return n;
        }
        int ans1,ans2;

        if(dp[n - 1] == -1 ){
            ans1 = fibb(n-1,dp);
            dp[n-1]=ans1;
        }else
            ans1=dp[n-1];

        if(dp[n - 2] == -1 ){
            ans2 = fibb(n-2,dp);
            dp[n-2]=ans1;
        }else
            ans2=dp[n-2];

        int finalAns = ans1+ans2;
        return finalAns;

    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int fib = s.nextInt();
        int dp[] = new int[fib+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans =fibb(fib,dp);
        dp[fib]=ans;
        System.out.println(ans);
    }
}
