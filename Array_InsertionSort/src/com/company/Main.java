package com.company;

public class Main {

    public static int[] insertionSort(int[] input){

        for(int i=0;i<input.length;i++){

            int temp = input[i];
            int j=i-1;

            while (j>=0 && input[j]>temp){

                input[j+1]=input[j];
                j--;

            }

            input[j+1] = temp;

        }
return input;
    }

    public static void main(String[] args) {
	int input[] = {9,8,7,6,5};
	input = insertionSort(input);
	for(int i=0;i<input.length;i++){
        System.out.println(input[i]);
    }
    }
}
