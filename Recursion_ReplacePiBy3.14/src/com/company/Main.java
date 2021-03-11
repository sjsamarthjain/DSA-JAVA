package com.company;

public class Main {

    public static String replacePi(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){

            String small = replacePi(s.substring(2));
            return "3.14"+small;
        }else
        {

            String small = replacePi(s.substring(1));
            return s.charAt(0)+small;

        }


    }



    public static void main(String[] args) {

        System.out.println(replacePi("pipipipipipiippppppppiiiiii"));

    }
}
