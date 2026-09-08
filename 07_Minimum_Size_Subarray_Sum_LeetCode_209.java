package com.shoppingApp.demo.service;

import java.util.Arrays;

public class DemoClass {

    // STATUS: NEEDS REVIEW
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        while (j < nums.length) {
            sum = sum + nums[j];

            while (sum >= target) {
                if (length > ((j - i) + 1)) {
                    length = (j - i) + 1;
                }

                sum = sum - nums[i];
                i++;
            }

            j++;
        }

        if (length == Integer.MAX_VALUE) return 0;
        else return length;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {2, 3, 1, 2, 4, 3},
                {1, 4, 4},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5},
                {5},
                {1, 2, 1, 1, 1, 10},
                {2, 3, 1, 2, 4, 3}
        };

        int[] targets = {
                7,
                4,
                11,
                15,
                5,
                11,
                6
        };

        int[] expected = {
                2,
                1,
                0,
                5,
                1,
                2,
                2
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = minSubArrayLen(targets[i], testCases[i]);

            System.out.println(
                    "Array: " + Arrays.toString(testCases[i])
                    + ", target = " + targets[i]
                    + " -> Answer = " + result
                    + " | Expected = " + expected[i]
            );
        }
    }
}
