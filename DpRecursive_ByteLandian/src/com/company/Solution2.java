package com.company;

import java.util.HashMap;

public class Solution2 {

    public static long bytelandian(long n, HashMap<Long, Long> table) {

        if (n < 12)
            return n;

        if (table.containsKey(n))
            return table.get(n);

        // Take the optimal strategy by exchanging with the bank.
        // int type is not sufficient to hold the result when n is large.
        long maxDollarsOfNCoins = bytelandian(n / 2, table) + bytelandian(n / 3, table) + bytelandian(n / 4, table);

        // Save the result to avoid duplicate computation
        table.put(n, maxDollarsOfNCoins);

        return maxDollarsOfNCoins;
    }

}
