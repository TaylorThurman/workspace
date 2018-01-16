package com.astontech.learningAlgorithms.algoBinarySearch;

public class Main {

    /*
        1) p=0 , r=A.length-1
        2) while p<=r do
            a) set q =  |_p+r/2_|
            b) if A[q]==x, return q
            c) if A[q]>x  set r=q-1
               else set p to q+1
        3) return -1
     */

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(a, 20));
    }

    public static int binarySearch(int[] a, int x) {
        int p = 0; // 0 index
        int r = a.length-1; // last index

        while (p<=r) {
            int q = (p+r)/2;    // the middle index
            if(a[q] < x) {  // if the value at the index is less than x, the beginning index now starts
                p = q + 1;  // 1 index after the original middle index
            } else if (a[q] > x) {  // if the value at the index is greater than, the beginning index now
                r = q-1;            // starts 1 index before the original middle index
            } else {
                return q;   // if the middle index is equal to x
            }
        }

        return -1; // if x is not in the array
    }
}
