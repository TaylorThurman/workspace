package com.workspace.workspace.codeSignalAlgos;

public class ReverseParenthesis {

    public static void main(String[] args) {
        String input = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        // output: The god quick nworb xof jumps over the lazy

        System.out.println(reverseParentheses(input));
    }

    static String reverseParentheses(String s) {

        //counts the sets of parenthesis
        int parenthesesCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                parenthesesCount++;
            }
        }

        // if none return string
        if (parenthesesCount == 0) return s;

        StringBuilder sb = new StringBuilder(s);

        // keep track of indices in order to substring later
        int leftIndex = 0;
        int rightIndex = 0;

        // loop starts right before first "("
        for (int i = sb.indexOf("(") - 1; i < sb.length(); i++) {

            // grabs "(" until it finds a ")" then it know to reverse between those indices
            if (sb.charAt(i) == '(') {
                leftIndex = i;
            } else if (sb.charAt(i) == ')') {
                rightIndex = i;

                // put substring in builder in order to reverse
                StringBuilder tempSb = new StringBuilder(sb.substring(leftIndex + 1, rightIndex));
                tempSb.reverse();
                sb.replace(leftIndex, rightIndex + 1, tempSb.toString());

                // starts back at the first found "("
                parenthesesCount--;
                if (parenthesesCount != 0) {
                    i = sb.indexOf("(") - 1;
                }
            }
        }

        return sb.toString();
    }

    static String reverseParentheses2(String s) {
       int lastLeftPar = s.lastIndexOf("(");

       while (lastLeftPar != -1) {
           int rightIndex = s.indexOf(")", lastLeftPar);
           String temp = s.substring(0, lastLeftPar);
           temp += new StringBuilder(s.substring(lastLeftPar + 1, rightIndex))
                                        .reverse()
                                        .toString();
           temp += s.substring(rightIndex + 1);
           s = temp;
           lastLeftPar = s.lastIndexOf("(");
       }

       return s;
    }
}
