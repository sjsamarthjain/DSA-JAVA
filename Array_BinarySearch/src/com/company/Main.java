package com.company;

public class Main {
    
    public static int binarySearch(int input[], int elem){

        int start=0;
        int end = input.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(elem==input[mid]){
                return mid;
            }
            else if(elem>input[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(binarySearch(input,5));

    }
}
