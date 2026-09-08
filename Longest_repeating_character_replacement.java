package com.shoppingApp.demo.service;

import java.util.HashMap;
import java.util.Map;

public class Longest_repeating_character_replacement {
    public static int characterReplacement(String s, int k) {

        int i = 0;
        int j = 0;
        int maxLength = 0;
        int finalMaxLength= 0;


        Map<Character, Integer> frequency = new HashMap<>();

        while (j < s.length()) {
            Character c= s.charAt(j);
            frequency.put(c,  frequency.getOrDefault(c, 0) + 1);
            maxLength = Math.max(
                    maxLength,
                    frequency.get(c)
            );
            while(((j-i)+1)-maxLength> k){
                Character ch= s.charAt(i);
                frequency.put(ch, (frequency.get(c)-1));
                i++;
            }

            finalMaxLength = Math.max(
                    finalMaxLength,
                    (j - i) + 1
            );
            j++;
        }

        return finalMaxLength;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "ABAB",
                "AABABBA",
                "AAAA",
                "ABCDE",
                "ABBB",
                "BAAAB"
        };

        int[] kValues = {
                2,
                1,
                2,
                1,
                2,
                1
        };

        int[] expected = {
                4,
                4,
                4,
                2,
                5,
                4
        };

        for (int i = 0; i < testCases.length; i++) {

            int result = characterReplacement(
                    testCases[i],
                    kValues[i]
            );

            System.out.println(
                    "String: \"" + testCases[i] + "\""
                            + ", k = " + kValues[i]
                            + " -> Answer = " + result
                            + " | Expected = " + expected[i]
            );
        }
    }
}
