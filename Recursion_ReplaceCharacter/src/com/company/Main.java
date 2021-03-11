package com.company;

public class Main {

    public static String replace(String s, char a, char b){
        if(s.length()==0){
            return s;
        }

        String smallOutput = replace(s.substring(1),a,b);

        if(s.charAt(0)==a){
            return b+smallOutput;
        }else
            return s.charAt(0)+smallOutput;


    }

    public static void main(String[] args) {

        String s = "bcaahfcbsvdbca";
        String d = replace(s,'a','b');
        System.out.println(d);
    }
}
