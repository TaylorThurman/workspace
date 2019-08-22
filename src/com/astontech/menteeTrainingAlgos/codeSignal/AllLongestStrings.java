package com.astontech.menteeTrainingAlgos.codeSignal;

import java.util.Arrays;

public class AllLongestStrings {

    public static void main(String[] args) {
        String[] strings = {"aba", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(allLongestStrings(strings)));
    }

    private static String[] allLongestStrings(String[] inputArray) {
        int longString = 0;
        int index = 0;
        int count = 0;
        for (String s : inputArray) {
            if (s.length() > longString) {
                longString = s.length();
            }
        }
        for (String st : inputArray) {
            if (st.length() == longString) {
                count++;
            }
        }

        String[] newList = new String[count];

        for (int i = 0; i < inputArray.length; i++) {
            if (longString == inputArray[i].length()) {
                newList[index] = inputArray[i];
                index++;
            }
        }

        return newList;
    }
}
