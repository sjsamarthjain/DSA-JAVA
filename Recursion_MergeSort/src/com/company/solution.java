package com.company;

public class solution { 

    public static void mergeSort(int[] a) {
        // Write your code here
        if (a.length <= 1) {
            return;
        }   
        int b[] = new int[a.length / 2];
        int c[] = new int[a.length - b.length];


        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }


        for (int i = b.length; i < a.length; i++) {
            c[i - a.length / 2] = a[i];
        }

        mergeSort(b);
        mergeSort(c);

        merge(b, c, a);

    }

    public static void merge(int[] s1, int[] s2, int[] ans) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1.length && j < s2.length) {

            if (s1[i] < s2[j]) {
                ans[k] = s1[i];
                i++;
                k++;
            } else {
                ans[k] = s2[j];
                j++;
                k++;
            }

        }
        if (i < s1.length) {
            while (i < s1.length) {
                ans[k] = s1[i];
                i++;
                k++;
            }
        }
        if (j < s2.length) {
            while (j < s2.length) {
                ans[k] = s2[j];
                j++;
                k++;
            }
        }


    }
}
