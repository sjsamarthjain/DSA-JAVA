package com.company;

public class Main {

    public static int[] SelectionSort(int input[]){

        for(int i=0; i< input.length-1; i++){
            int min = input[i];
            int minIndex =i;

            for(int j=i+1;j<input.length;j++){

                if(input[j]<min){
                    min=input[j];
                    minIndex=j;
                }

                if(minIndex!=i){
                    input[minIndex]=input[i];
                    input[i]=min;
                }

            }
        }
return input;
    }

    public static void main(String[] args) {
        int[] input = {9,8,7,6,5,4,3,2,1};
        int ans[] = new int[input.length];
	    ans=SelectionSort(input);
    }
}
