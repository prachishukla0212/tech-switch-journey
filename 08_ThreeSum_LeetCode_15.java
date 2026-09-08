package com.shoppingApp.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoClass {

    public static List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list = new ArrayList<>();
      Arrays.sort(nums);
      for(int i = 0; i< nums.length-2; i++){
          int j= i+1; int k= nums.length-1;
          while(j<k){
              int sum = nums[i]+ nums[j]+ nums[k];
              if(sum==0){
                  list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                  while(j<k && nums[j]==nums[j+1]) j++;
                  while(j<k && nums[k]==nums[k-1]) k--;
                  j++;
                  k--;
              }
              else if(sum<0) j++;
              else k--;
          }
      }
      return list;
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {-1, 0, 1, 2, -1, -4},
                {0, 1, 1},
                {0, 0, 0},
                {-2, 0, 1, 1, 2},
                {-1, 0, 1, 0},
                {-2, -1, 0, 1, 2, 3}
        };

        for (int[] nums : testCases) {

            List<List<Integer>> result = threeSum(nums);

            System.out.println(
                    "Input: " + Arrays.toString(nums)
                            + " -> Result: " + result
            );
        }
    }
}
