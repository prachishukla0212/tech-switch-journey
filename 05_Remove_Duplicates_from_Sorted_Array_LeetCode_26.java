package com.shoppingApp.demo.service;

import java.util.Arrays;

public class DemoClass {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int lastNum = nums[i];

        while (j < nums.length) {
            if (nums[j] != lastNum) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                lastNum = nums[i];
            }
            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 1, 2},
                {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
                {1, 2, 3, 4, 5},
                {1, 1, 1, 1},
                {1},
                {-3, -3, -2, -1, -1, 0, 0, 2}
        };

        for (int[] nums : testCases) {
            int k = removeDuplicates(nums);

            System.out.println("k = " + k);
            System.out.println("Array = " + Arrays.toString(nums));
            System.out.println();
        }
    }
}
