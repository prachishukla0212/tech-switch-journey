package com.shoppingApp.demo.service;

import java.util.HashSet;
import java.util.Set;

public class DemoClass {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                while (set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }

            set.add(s.charAt(j));
            j++;

            if (maxLength < (j - i)) {
                maxLength = (j - i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "",
                "a",
                "abcdef",
                "abba",
                "dvdf"
        };

        int[] expected = {
                3,
                1,
                3,
                0,
                1,
                6,
                2,
                3
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = lengthOfLongestSubstring(testCases[i]);

            System.out.println(
                    "String: \"" + testCases[i] + "\""
                    + " -> Answer = " + result
                    + " | Expected = " + expected[i]
            );
        }
    }
}
