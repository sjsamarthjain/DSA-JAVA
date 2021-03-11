package com.company;

public class Main {

    public static int binarySearch(int a[], int si, int ei, int x){

        if(si>ei){
            return -1;
        }

        int  mid = (si+ei)/2;

        if(a[mid]==x){
            return mid;
        }else if(a[mid]<x){
            return binarySearch(a,mid+1,ei,x);
        }else
            return binarySearch(a,si, mid-1,x);

    }

    public static void main(String[] args) {
	// write your code here
      int a[]= {1,2,3,4,5,6,7,8,9,0};
      System.out.println(binarySearch(a,0,a.length-1,7));

    }
}
