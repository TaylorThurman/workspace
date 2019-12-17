package com.astontech;


import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hiya");


    }



    private static void findNumbersEqualToSum() {
        // Given a string input  find all the pairs that can make the sum, in the given string
        // sum =  ";#"
        // "0,1,2,3,4;5"  =  2,3 : 1,4
        // output should be #+# , #+#
        // If no matches present,  return "Not Possible"

        String input = "0,1,2,3,4;5";
        String total = input.substring(input.lastIndexOf(';')+1);
        int sum = Integer.parseInt(total);
        input = input.substring(0,input.lastIndexOf(';'));
        System.out.println(sum);
        System.out.println(input);

        String[] splitNums = input.split(",");
        String output = "";
        for (int i = 0; i < splitNums.length; i++) {
            for(int j = i +1; j < splitNums.length; j++) {

                if(Integer.parseInt(splitNums[i]) + Integer.parseInt(splitNums[j]) == sum) {
                    output += splitNums[i] + "+" + splitNums[j] + " , ";
                }
            }
        }
        if(output.length()<1) {
            System.out.println("not Possible");
        } else {
            System.out.println("Result Set: " + output.substring(0, output.lastIndexOf(',')));
        }
    }

    private static String findSum(String str) {
//        String lastNumber = str.substring(str.lastIndexOf(';')+1);
//        int sum = Integer.parseInt(lastNumber);
//
//        str = str.substring(0,str.lastIndexOf(';'));
//
//        str = str.replace(',', ' ');
//
//        char[] c = new char['\u0000'];
//        System.out.println(c);
//        for(Character character : str) {
//            if(character != ' ') {
//                c =
//            }
//        }
//        str = str.replaceAll("\\s", "");
//        char[] c = str.toCharArray();
//
//
//
////        for (int i = 0; i < c.length; i++) {
////            int[] iArray = new int[c[i]]
////        }
//
//
//
//
//
        return str;
    }

//    private static List<String> findDuplicate(String string) {
//        String[] array = string.split("")
//      System.out.println(findDuplicate("10; 1,2,3,4,5,6,7,8,9,9"));
//    }

    private static String theLastWord(String initialWord) {
        char[] charArray = initialWord.toCharArray();
        String newString = "" + charArray[0];

        for (int i = 1; i < charArray.length; i++) {
            if(charArray[i] >= newString.indexOf(0)) {
              newString = newString + charArray[i];
            } else {
                newString = charArray[i] + newString;
            }
        }
        return newString;
    }

    private static void checkForPalindrome(String str) {


        String rev="";
        for (int i = 0; i < str.length(); i++) {
            char x= str.charAt(i);
                rev= x + rev;
        }

        if(rev.equalsIgnoreCase(str)) {
            System.out.println(str +" is Palindrome Word");
        } else
            System.out.println(str + " is not a Palindrome Word");
    }

    private static Integer findNumOccurrences(String wordMatch, String sentence) {

        // put this in the main to run
//        System.out.println(findNumOccurrences("be", "To be or not to be that is the question"));

        String niceString = sentence.replaceAll("[^A-Za-z0-9]", " ");
        return Arrays.stream(niceString.split(" "))
                .filter(word -> word.equals(wordMatch))
                .toArray().length;
    }

    private static void addNumbersInArray() {
        int[] numbersToAdd = {1,2,3,4,10,11};

        System.out.println(IntStream.of(numbersToAdd).sum());
    }

    private static void removeStuff() {
        // find all distinct values in set 1 that arent in set B
        Set<Integer> aSet = new HashSet<>();
        aSet.add(1);
        aSet.add(2);
        aSet.add(3);
        Set<Integer> bSet = new HashSet<>();
        bSet.add(1);
        bSet.add(3);
        bSet.add(7);
    }

    private static void parseTHis() {
        String parseThis = " 1,4,2,6,2,7,2,8,9,10,100,2,6,2";
        String parsedString = parseThis.replaceAll("2", "");
        String secondParsedString = parsedString.replaceAll(",", " ");

        System.out.println(secondParsedString);
    }
}
