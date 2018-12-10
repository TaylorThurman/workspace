package com.workspace.workspace.codeSignalAlgos;

public class digitRootSort {

    public static void main(String[] args) {
        int[] a = {13, 20, 7, 4};
        digitRootSort(a);
    }

    static int[] digitRootSort(int[] a) {
        int[] convertedNumbers = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            String tempDigit = String.valueOf(a[i]);
            int addNumbers = 0;
            for (Character c : tempDigit.toCharArray()) {
                addNumbers += Integer.parseInt(c.toString());
            }
        }

        boolean finished = false;
        while (finished != true) {

        }
        return a;
    }
}
