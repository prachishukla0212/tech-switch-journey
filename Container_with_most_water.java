package com.shoppingApp.demo.service;

import java.util.Arrays;

public class Container_with_most_water {

    public static int maxArea(int[] height) {
        int maxArea=0;
        int i =0; int j= height.length-1;
        while(i<j){
            int area= Math.min(height[i], height[j]) * (j-i);
            if(height[i]< height[j]) i++;
            else j--;

            if(area>maxArea) maxArea= area;
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 8, 6, 2, 5, 4, 8, 3, 7},
                {1, 1},
                {1, 2, 1},
                {4, 3, 2, 1, 4},
                {1, 2, 4, 3},
                {2, 3, 10, 5, 7, 8, 9}
        };

        int[] expected = {
                49,
                1,
                2,
                16,
                4,
                36
        };

        for (int i = 0; i < testCases.length; i++) {

            int result = maxArea(testCases[i]);

            System.out.println(
                    "Array: " + Arrays.toString(testCases[i])
                            + " -> Answer = " + result
                            + " | Expected = " + expected[i]
            );
        }
    }
}
