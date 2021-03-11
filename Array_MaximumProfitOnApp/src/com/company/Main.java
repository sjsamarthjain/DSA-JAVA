package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Maximum Profit on App
        //Send Feedback
        //You have made a smartphone app and want to set its subscription price such that the profit earned is
        // maximised. There are certain users who will subscribe to your app only if their budget is greater than
        // or equal to your price.
        //You will be provided with a list of size N having budgets of subscribers and you need to return the
        // maximum profit that you can earn.
        //Lets say you decide that price of your app is Rs. x and there are N number of subscribers.
        // So maximum profit you can earn is :

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++)
            input[i] = s.nextInt();

        System.out.println(solution.maximumProfit(input));

    }
}

