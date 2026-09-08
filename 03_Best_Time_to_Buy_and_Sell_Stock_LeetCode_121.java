package com.shoppingApp.demo.service;

import java.util.Arrays;

public class DemoClass {

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int num : prices) {
            if (num < buy) {
                buy = num;
            }

            if (num - buy > profit) {
                profit = num - buy;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {7, 1, 5, 3, 6, 4},
                {7, 6, 4, 3, 1},
                {2, 4, 1, 7},
                {1, 5},
                {5, 1, 5, 2, 10}
        };

        int[] expected = {
                5,
                0,
                6,
                4,
                9
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = maxProfit(testCases[i]);

            System.out.println(
                    "Array: " + Arrays.toString(testCases[i])
                    + " -> Answer = " + result
                    + " | Expected = " + expected[i]
            );
        }
    }
}
