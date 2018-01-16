package com.astontech.fizzBuzzTDD;

public class FizzBuzzNumberAdd {


    public static String evaluate(Integer n) {

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.print(n.toString() + "+");
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            System.out.print(n.toString() + "+");
            return "Fizz";
        } else if (n % 5 == 0) {
            System.out.print(n.toString() + "+");
            return "Buzz";
        }

        return n.toString();
    }
}
