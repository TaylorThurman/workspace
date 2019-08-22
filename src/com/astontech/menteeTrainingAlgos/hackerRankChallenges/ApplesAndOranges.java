package com.astontech.menteeTrainingAlgos.hackerRankChallenges;

public class ApplesAndOranges {

//    https://www.hackerrank.com/challenges/apple-and-orange/problem

    public static void main(String[] args) {
        applesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }

    public static void applesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesOnHouse = 0;
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) applesOnHouse++;
        }

        int orangesOnHouse = 0;
        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] + b <= t && oranges[i] + b >= s) orangesOnHouse++;
        }

        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);
    }
}
