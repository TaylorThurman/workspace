package com.workspace.workspace.codeSignalAlgos;

public class IsLucky {

    public static void main(String[] args) {
        isLucky(1230);
    }

    static boolean isLucky(int n) {
        String num = String.valueOf(n);
        int firstSum = 0;
        int secondSum = 0;
        char[] numbers = num.toCharArray();

        int halfWayNumber = (numbers.length / 2);
        for (int i = 0; i < numbers.length; i++) {
            if (i < halfWayNumber) {
                firstSum += (int) numbers[i];
            } else {
                secondSum += (int) numbers[i];
            }
        }

        if (firstSum == secondSum) {
            return true;
        }

        return false;
    }
}
