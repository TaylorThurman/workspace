package com.workspace.workspace.codeSignalAlgos;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {

    public static void main(String[] args) {
        String[] a = {"aba", "aa", "ad", "vcd", "aba"};
        allLongestStrings(a);
    }

    static String[] allLongestStrings(String[] inputArray) {
        int longestStringLength = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > longestStringLength) {
                longestStringLength = inputArray[i].length();
            }
        }

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == longestStringLength) {
                stringList.add(inputArray[i]);
            }
        }
        String[] list = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            list[i] = stringList.get(i);
        }
        return list;
    }

}
