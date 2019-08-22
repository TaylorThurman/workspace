package com.astontech.menteeTrainingAlgos.codeSignal;

import java.text.Format;

public class AmendTheSentenceMentee {

//    https://app.codesignal.com/interview-practice/task/yXDg4rAk9ooEjLjdj/solutions

    public static void main(String[] args) {
        System.out.println(amendTheSentence("CodesignalIsAwesome"));
    }

    public static String amendTheSentence(String s) {

        char[] chars = s.toCharArray();

        Character c = new Character('C');

        char c1 = Character.toLowerCase(c);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                result.append(Character.toLowerCase(chars[i]));
            } else if (Character.isUpperCase(chars[i])) {
                result.append(" " + Character.toLowerCase(chars[i]));
            } else {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }


}
