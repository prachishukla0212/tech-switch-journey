package com.shoppingApp.demo.service;

import java.util.Arrays;

public class DemoClass {

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {0, 1, 0, 3, 12},
                {0},
                {1, 2, 3},
                {1, 0, 0, 2, 0, 3},
                {0, 0, 1}
        };

        int[][] expected = {
                {1, 3, 12, 0, 0},
                {0},
                {1, 2, 3},
                {1, 2, 3, 0, 0, 0},
                {1, 0, 0}
        };

        for (int i = 0; i < testCases.length; i++) {
            moveZeroes(testCases[i]);

            System.out.println(
                    "Input -> Result: " + Arrays.toString(testCases[i])
                    + " | Expected = " + Arrays.toString(expected[i])
            );
        }
    }
}
