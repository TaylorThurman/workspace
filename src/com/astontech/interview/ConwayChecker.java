package com.astontech.interview;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class ConwayChecker {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int L = in.nextInt();
//        int R = 1;
//        int L = 11;

//        1 1 1 3 1 2 2 1 1 3 3 1 1 2 1 3 2 1 1 3 2 1 2 2 2 1

        List<String> initialR = new ArrayList();
        initialR.add(Integer.toString(R));

        // System.err.println(finalResult);
        if (L > 1) {
            List<String> finalResult = conwayChecker(initialR);
            for (int i = 1; i < L-1; i ++){
                finalResult = conwayChecker(finalResult);
            }

            for (int i = 1; i < finalResult.size(); i++) {
                System.out.println(finalResult.get(i));
            }
        } else {
            System.out.println(R);
        }



    }

    public static List<String> conwayChecker(List<String> initialR){

        List<String> result = new ArrayList();
        int count = 0;
        String num = " ";

        loop:
        for (int i = 0; i < initialR.size(); i++){
            if (initialR.get(i) != " ") {
                count += 1;
                num = initialR.get(i);
                if (i + 1 < initialR.size()) {
                    if (initialR.get(i + 2).equals(num)) {
                        continue loop;
                    } else {
                        result.add(" ");
                        result.add(Integer.toString(count));
                        result.add(" ");
                        result.add(num);
                        count = 0;
                        num = " ";
                    }
                } else {
                    result.add(" ");
                    result.add(Integer.toString(count));
                    result.add(" ");
                    result.add(num);
                    count = 0;
                    num = " ";
                }
            }
        }
        return result;
    }

}