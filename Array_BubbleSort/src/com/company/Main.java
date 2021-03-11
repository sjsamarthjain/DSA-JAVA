package com.company;

public class Main {

    public static int[] BubbleSort(int input[]){

        for(int i=0;i<input.length-1;i++){

            for(int j=0;j<input.length-i-1;j++){
                if(input[j+1]>input[j]){
                    int temp = input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;

                }
            }

        }return input;
    }

    public static void main(String[] args) {
        int input[] = {9,8,6,5,4,3,2};
        input = BubbleSort(input);
        for (int i=0;i<input.length;i++){
            System.out.println(input[i]);

        }

    }
}
