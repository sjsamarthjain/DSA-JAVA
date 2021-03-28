package com.company;

public class SolutionUsingIterativeDP {

    public static int countMinStepsToOne(int n) {
        //Your code goes here
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 0;
        for (int i = 2; i <= n; i++) {
            int count1 = Integer.MAX_VALUE, count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE;
            count1 = storage[i - 1];
            if (i % 2 == 0)
                count2 = storage[i / 2];
            if (i % 3 == 0)
                count3 = storage[i / 3];

            storage[i] = Math.min(count1, Math.min(count2, count3)) + 1;

        }
        return storage[n];
    }
}
