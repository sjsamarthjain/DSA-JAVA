package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSubsequences("xyz");
    }
    public static void printSubsequences(String str){

        printSubsequencesBetter(str,"");
    }
    public static void printSubsequencesBetter(String str, String outputSoFar){

        if(str.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        //When we choose not to include 1st character
        printSubsequencesBetter(str.substring(1),outputSoFar);
        //When we choose to include the 1st character
        printSubsequencesBetter(str.substring(1),outputSoFar+str.charAt(0));
    }
}
