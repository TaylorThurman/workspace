package com.astontech.menteeTrainingAlgos.strings;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    private static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char placeholderIndex = chars[i];
            int endIndex = (s.length() -1) - i;
            chars[i] = chars[endIndex];
            chars[endIndex] = placeholderIndex;
        }

        return new String(chars).equals(s);
    }
}
