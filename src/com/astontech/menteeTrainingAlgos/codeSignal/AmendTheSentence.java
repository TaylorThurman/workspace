package com.astontech.menteeTrainingAlgos.codeSignal;

public class AmendTheSentence {

//    https://app.codesignal.com/interview-practice/task/yXDg4rAk9ooEjLjdj/solutions

    public static void main(String[] args) {
        System.out.println(amendTheSentence("CodesignalIsAwesome"));
    }

    public static String amendTheSentence(String s) {
        char[] chars = s.toCharArray();

        StringBuilder amended = new StringBuilder();
        amended.append(Character.toLowerCase(chars[0]));
        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                amended.append(" " + Character.toLowerCase(chars[i]));
            } else {
                amended.append(chars[i]);
            }
        }
        return amended.toString();
    }
}
