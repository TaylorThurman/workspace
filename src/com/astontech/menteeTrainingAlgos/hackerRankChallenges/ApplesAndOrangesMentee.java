package com.astontech.menteeTrainingAlgos.hackerRankChallenges;

public class ApplesAndOrangesMentee {

//    https://www.hackerrank.com/challenges/apple-and-orange/problem

    public static void main(String[] args) {
        applesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }

    public static void applesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int i : apples) {
            if (a + i >= s && a + i <= t) {
                appleCount++;
            }
        }

        for(int i : oranges) {
            if (b + i >= s && b + i <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
