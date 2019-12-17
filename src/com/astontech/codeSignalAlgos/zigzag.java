package com.workspace.workspace.codeSignalAlgos;

public class zigzag {

    public static void main(String[] args) {
        int[] a = {9, 8, 8, 5, 3, 5, 3, 2, 8, 6};
        System.out.println(zigzag(a));
    }

    static int zigzag(int[] a) {
        int bestzigzag = 1;
        int currentzigzag = 1;
        int needsToGoUp = 2;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] > a[i + 1] && (needsToGoUp == 0 || needsToGoUp == 2)) {
                currentzigzag++;
                needsToGoUp = 1;
            } else if (a[i] < a[i + 1] && (needsToGoUp == 1 || needsToGoUp == 2)) {
                currentzigzag++;
                needsToGoUp = 0;
            } else {
                currentzigzag = 1;
                needsToGoUp = 2;
                if (a[i] != a[i + 1]) {
                    i -= 1;
                }
            }

            if (currentzigzag > bestzigzag) {
                bestzigzag = currentzigzag;
            }
        }

        return bestzigzag;
    }
}
