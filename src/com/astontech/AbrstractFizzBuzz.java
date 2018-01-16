package com.astontech;

import java.util.ArrayList;
import java.util.List;

public class AbrstractFizzBuzz {

    public static void main(String[] args) {
        List<String> fizzy = abstractFizzBuzz(100);
        fizzy.forEach(System.out::println);
    }

    private static List<String> abstractFizzBuzz(int iterateTo) {
        List<String> toReturn = new ArrayList<>();
        for (int i = 1; i <= iterateTo; i++) {
            final String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");
            if (word.isEmpty()) {
                toReturn.add(Integer.toString(i));
            } else {
                toReturn.add(word);
            }
        }
        return toReturn;
    }

    private static String toWord(int divisor, int value, String word) {
        return value % divisor == 0 ? word : "";
    }
}
