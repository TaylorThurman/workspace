package com.workspace.workspace.codeSignalAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AreSimilar {

    public static void main(String[] args) {
        int[] a = {2, 3, 1};
        int[] b = {1, 3, 2};
        System.out.println(areSimiliar2(a, b));
    }

    static boolean areSimilar(int[] a, int[] b) {
        boolean flag = true;
        if (!Arrays.equals(a, b)) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length; j++) {
                    flop(a, i, j);
                    if (Arrays.equals(a, b)) {
                        return true;
                    } else {
                        flop(a, i, j);
                        flag = false;
                    }
                }
            }
        }

        return flag;
    }

    private static int[] flop(int[] c, int i, int j) {
        int temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return c;
    }

    static boolean areSimiliar2(int[] a, int[] b) {
        List<Integer> outOfPlaceNumbers = new ArrayList<>();
        IntStream.rangeClosed(0, a.length -1)
                .forEach(i -> {
                    if (a[i] != b[i]) outOfPlaceNumbers.add(i);
                });
        if (outOfPlaceNumbers.size() == 0) return true;
        if (outOfPlaceNumbers.size() == 2) {
            int num1 = outOfPlaceNumbers.get(0);
            int num2 = outOfPlaceNumbers.get(1);
            if (a[num1] == b[num2] && a[num2] == b[num1]) return true;
        }
        return false;
    }
}
