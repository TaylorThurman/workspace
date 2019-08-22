package com.astontech.menteeTrainingAlgos.strings;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class StrStr {

//    https://app.codesignal.com/interview-practice/task/C8Jdyk3ybixqQdAvM

    public static void main(String[] args) {
//        String s = "CodefightsIsAwesome";
//        String x = "IA";
//        System.out.println(strstr(s, x));
//
//        String s1 = "CodefightsIsAwesome";
//        String x1 = "IsA";
//        System.out.println(strstr(s1, x1));
//
//        String s2 = "sst";
//        String x2 = "st";
//        System.out.println(strstr(s2, x2));
    }

    static int strstr(String s, String x) {
        int startIndex = -1;

        int stringToCheckIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            // if letters match
            if (s.charAt(i) == x.charAt(stringToCheckIndex)) {
                // if only one character in both strings
                if (x.length() == 1) {
                    return 0;
                }

                stringToCheckIndex++;
                if (stringToCheckIndex == x.length()) {
                    return startIndex;
                } else if (startIndex == -1){
                    startIndex = i;
                }

            // letters dont match anymore
            // reset indices and set i back one
            } else if (stringToCheckIndex > 0) {
                stringToCheckIndex = 0;
                startIndex = -1;
                i -= 1;

            // letters never matched
            // reset indices
            } else {
                stringToCheckIndex = 0;
                startIndex = -1;
            }
        }

        return x.length() == startIndex ? startIndex : -1;

    }

}
