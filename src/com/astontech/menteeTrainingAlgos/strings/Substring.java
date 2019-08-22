package com.astontech.menteeTrainingAlgos.strings;

public class Substring {

    public static void main(String[] args) {
        System.out.println(printSubstring("Helloworld", 3, 7));
    }

    private static String printSubstring(String s, int start, int end) {
        return s.substring(start, end);
    }
}
