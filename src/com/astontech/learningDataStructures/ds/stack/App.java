package com.astontech.learningDataStructures.ds.stack;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
//        Stack theStack = new Stack(3);
//        theStack.push('a');
//        theStack.push('b');
//        theStack.push('c');
//        theStack.push('d');
//
//
//
//        while (!theStack.isEmpty()){
//            char value = theStack.pop();
//            System.out.println(value);
//        }

        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String string) {
        int stackSize = string.length(); // get the max stack size
        Stack stack = new Stack(stackSize); // make the stack
        char[] ca = string.toCharArray();

        for (char c : ca) {
            stack.push(c);
        }

        String newString = "";
        while (!stack.isEmpty()){
            newString += stack.pop();
        }
        return newString;
    }
}
