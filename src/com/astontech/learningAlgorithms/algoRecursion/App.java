package com.astontech.learningAlgorithms.algoRecursion;

public class App {

    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0, 7, 18));
    }

    public static void reduceByOne(int n) {
        if (n != 0) {
            reduceByOne(n-1);
        }
        System.out.println("Completed Call: " + n);
    }

    //region RECURSIVE LINEAR SEARCH

    /*
        PROCEDURE: recursive-linear-search(A,i,x);

        INPUTS: same a linearSearch but with added parameter i
        OUTPUT: the index of an element matching x in the subarray from A[i]
                through A[n], or -1 if ix is not found in the array

        1) if i>n, then return -1
        2) else if A[i] == x, then return i
        3) else return recursiveLinearSearch(A,i+1,x)
     */

    public static int recursiveLinearSearch(int[] a, int i, int x) {
        if(i>a.length-1){       // if evaluates to true, x was not found in the array
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            System.out.println("index at: "+i);
            return recursiveLinearSearch(a, i+1, x);
        }
    }

    //endregion

    //region RECURSIVE BINARY SEARCH

    /*
        PROCEDURE: Recursive-Binary-Search(A,p,r,x);
        INPUTS: A and x are the same as linearSearch. p and r represent the subarray A[p ... r] under consideration
        OUTPUTS: Same as linearSearch

        1) if p>r, return -1
        2) else:
            A. Set q to [ (p + r)/2]
            B. if A[q] == x, then return q
            C. else if A[q] > x
                    then return recursiveBinarySearch(A, p, q-1, x)
            D. else return recursiveBinarySearch(A, q+1, r , x)


     */

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
        System.out.println("[ " + p + "..." + r + " ]");
        int q = (p+r)/2;
        if (a[q] == x) {
            return q;
        } else if (a[q] > x) {
            return recursiveBinarySearch(a, p, q-1, x);
        } else {
            return recursiveBinarySearch(a, q+1, r, x);
        }

    }

    //endregion
}
