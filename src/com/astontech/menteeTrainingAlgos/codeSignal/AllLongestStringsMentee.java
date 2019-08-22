package com.astontech.menteeTrainingAlgos.codeSignal;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class AllLongestStringsMentee {

    public static void main(String[] args) {
        String[] strings = {"aba", "ad", "vcd", "aba"};

        System.out.println(Arrays.toString(allLongestStrings(strings)));

    int arrayLength = 0;}

    private static String[] allLongestStrings(String[] inputArray) {

        int longest = 0;
        int arrayLength = 0;

        for ( String s : inputArray ) {
            if (s.length() > longest) {
                longest = s.length();
                arrayLength = 1;
            } else if (s.length() == longest) {
                arrayLength++;
            }
        }

        String[] results = new String[arrayLength];
        int index = 0;
        for (int i = 0; i < inputArray.length ; i++) {
            if (inputArray[i].length() == longest) {
                results[index] = inputArray[i];
                index++;
            }
        }
        return results;
    }
}
