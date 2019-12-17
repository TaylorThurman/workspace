package com.workspace.workspace.codeSignalAlgos;

public class checkPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("racecar"));
    }

    static boolean checkPalindrome(String inputString) {

        for(int i=0; i < inputString.length() -1; i++) {
            int leftIndex = inputString.charAt(i);
            int rightIndex = inputString.charAt(inputString.length() - 1- i);
            if (leftIndex != rightIndex) {
                return false;
            }
        }

        return true;
    }
}
