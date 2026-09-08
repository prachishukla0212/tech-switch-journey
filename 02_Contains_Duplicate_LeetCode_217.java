package com.shoppingApp.demo.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DemoClass {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 3, 1},
                {1, 2, 3, 4},
                {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}
        };

        boolean[] expected = {
                true,
                false,
                true
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = containsDuplicate(testCases[i]);

            System.out.println(
                    "Array: " + Arrays.toString(testCases[i])
                    + " -> Answer = " + result
                    + " | Expected = " + expected[i]
            );
        }
    }
}
