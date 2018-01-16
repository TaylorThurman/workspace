package com.astontech.learningAlgorithms.algoLinearSearch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
        Procedure LINEAR-SEARCH(a,x)

        Inputs:
            - a: the array to search in
            - x: the value we are searching for in a

        Outputs:
            - The index position where a[i] == x or -1 if not found

        1) Set answer to -1
        2) For each index i going form 1 to n, in order
            - If a[i] = x, then set answer to the value of i
        3) Return the value of answer (the index) as the output
     */

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};  // random list of ints
        int valueSearchedFor = 1;  // any value we want to look for
        System.out.println(linearSearch(intArray,valueSearchedFor));
    }


    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
