package com.astontech.menteeTrainingAlgos.codeSignal;

import java.util.Arrays;

public class ReverseInParentheses {

    public static void main(String[] args) {
        String s = "foo(bar(baz))blim";
        System.out.println(reverseInParentheses(s));

    }

    public static String reverseInParentheses(String inputString) {
        char[] chars = inputString.toCharArray();
        int countPars = 0;
        int parCount = 0;
        int beginningIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') countPars++;
        }

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                if (parCount==0) beginningIndex = i;
                parCount+=1;
            } else if (chars[i] == ')') {
                parCount-=1;
                if (parCount==0) {
                    endIndex = i;

                    StringBuilder stringToReverse = new StringBuilder(inputString.substring(beginningIndex+1, endIndex));
                    String reversed = stringToReverse.toString().replace('(', '*');
                    reversed = stringToReverse.toString().replace(')', '(');
                    reversed = stringToReverse.toString().replace('*', ')');
                    System.out.println(reversed);
                    inputString = inputString.replace(inputString.substring(beginningIndex,endIndex+1), stringToReverse.reverse());
                    chars = inputString.toCharArray();

                    countPars-=1;
                    if (countPars==0) break;
                    i=0;
                }
            }

        }
        return inputString;
    }

    public static String replaceParenthesis(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(') {
                chars[i] = ')';
                continue;
            }
            if (chars[i] == ')') chars[i] = '(';
        }
        return new String(chars);
    }
}
