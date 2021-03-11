package com.company;

public class Main {

    public static int[] merge(int arr1[],int arr2[]){

        int i=0;
        int j=0;
        int k=0;
        int ans[] = new int[arr1.length + arr2.length];
        while(i< arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
                 }
            else   {
                ans[k]=arr2[j];
                k++;
                j++;
            }


        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr1[j];
            j++;
            k++;
        }
return ans;
    }

    public static void main(String[] args) {
	int a1[]={1,2,3,4,5,6};
	int a2[]={7,8,9,10,11};
	int a3[] = merge(a1,a2);
	for (int i=0;i<a3.length;i++){
	    System.out.println(a3[i]);
    }

    }
}
