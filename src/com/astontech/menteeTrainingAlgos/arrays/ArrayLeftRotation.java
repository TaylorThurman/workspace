package com.astontech.menteeTrainingAlgos.arrays;

import java.util.Arrays;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRotation(new int[]{1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(leftRotation(new int[]{1, 2, 3, 4, 5}, 6)));
        System.out.println(Arrays.toString(leftRotation(new int[]{1, 2, 3, 4, 5}, 9)));
    }

    public static int[] leftRotation(int[] arr, int leftTimes) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int tempLeftIndex = i - leftTimes;
            int adjustedIndex = result.length + tempLeftIndex;

            while (Math.abs(adjustedIndex) >= result.length) {
                if (Math.abs(adjustedIndex) == result.length) {
                    adjustedIndex = 0;
                    break;
                }
                adjustedIndex += result.length;
            }

            if (adjustedIndex < 0) {
                result[result.length + adjustedIndex] = arr[i];
            } else {
                result[adjustedIndex] = arr[i];
            }
        }

        return result;
    }
}
