package com.company;

public class Main {

    public static void main(String[] args) {
	//Given an integer N, find and return the count of minimum numbers required to represent N as a sum of
        // squares.
        //That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. The output
        // will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
    }
}


public class SolutionUsingMemoization {

    public static int minCount(int n) {
        //Your code goes here
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return better(n,dp);
    }
    public static int better(int n, int[] dp){
        if (n == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n * n; i++) {
            int currAns;
            if(dp[n-(i*i)]==-1){
                currAns = better(n - (i * i),dp);
                dp[n-(i*i)]=currAns;
            }else{
                currAns=dp[n-(i*i)];
            }

            if (currAns < min) {
                min = currAns;
            }
        }
        return 1 + min;
    }

}
