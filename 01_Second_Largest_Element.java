package com.shoppingApp.demo.service;

import java.util.Arrays;

public class DemoClass {

    public static int secondLargest(int[] nums) {
        int highest = nums[0];
        int secHighest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > highest) {
                secHighest = highest;
                highest = cur;
            }
            else if ((cur < highest) && (cur > secHighest)) {
                secHighest = cur;
            }
        }

        if (secHighest == Integer.MIN_VALUE) return -1;
        else return secHighest;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {3, 7, 2, 9, 5, 1},
                {10, 10, 8, 7},
                {5, 5, 5, 5},
                {-10, -5, -20, -3},
                {5, 4}
        };

        int[] expected = {
                7,
                8,
                -1,
                -5,
                4
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = secondLargest(testCases[i]);

            System.out.println(
                    "Array: " + Arrays.toString(testCases[i])
                    + " -> Answer = " + result
                    + " | Expected = " + expected[i]
            );
        }
    }
}
