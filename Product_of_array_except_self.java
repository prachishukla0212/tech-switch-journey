package com.shoppingApp.demo.service;

import java.util.Arrays;

public class Product_of_array_except_self {

    // APPROACH 1:
    // Your original approach:
    // Create separate left[] and right[] arrays.
    public static int[] productExceptSelfWithLeftRight(int[] nums) {
        int[] left = new int[nums.length];
        int[] right= new int[nums.length];
        int[] answer= new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(i==0) left[i]=1;
            else{
                left[i]= left[i-1] * nums[i-1];
            }
        }
        for(int i = nums.length-1; i>=0; i--){
            if(i==nums.length-1) right[i]=1;
            else{
                right[i]= right[i+1] * nums[i+1];
            }
        }
        for(int i = 0; i<nums.length; i++){
            answer[i]= left[i]*right[i];
        }

        return answer;
    }


    // APPROACH 2:
    // Optimized approach:
    // Reuse answer[] for left products
    // and maintain rightProduct as a single variable.
    // Extra space = O(1), excluding output array.
    public static int[] productExceptSelfOptimized(int[] nums) {
        int[] answer= new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            if(i==0) answer[i]=1;
            else{
                answer[i]= answer[i-1]* nums[i-1];
            }
        }
        int rightProduct= 1;
        for(int i = nums.length-1; i>=0; i--){
            answer[i]= answer[i]* rightProduct;
            rightProduct= rightProduct* nums[i];
        }
        return answer;
    }


    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 3, 4},
                {-1, 1, 0, -3, 3},
                {2, 3, 4, 5},
                {1, 1, 1, 1},
                {5, 2},
                {0, 0, 2, 3},
                {-2, 3, -4, 5}
        };

        int[][] expected = {
                {24, 12, 8, 6},
                {0, 0, 9, 0, 0},
                {60, 40, 30, 24},
                {1, 1, 1, 1},
                {2, 5},
                {0, 0, 0, 0},
                {-60, 40, -30, 24}
        };


        for (int i = 0; i < testCases.length; i++) {

            int[] result1 = productExceptSelfWithLeftRight(testCases[i]);

            int[] result2 = productExceptSelfOptimized(testCases[i]);

            System.out.println(
                    "Input:    " + Arrays.toString(testCases[i])
            );

            System.out.println(
                    "Approach 1: " + Arrays.toString(result1)
                            + " | Expected: " + Arrays.toString(expected[i])
            );

            System.out.println(
                    "Approach 2: " + Arrays.toString(result2)
                            + " | Expected: " + Arrays.toString(expected[i])
            );

            System.out.println();
        }
    }

}
