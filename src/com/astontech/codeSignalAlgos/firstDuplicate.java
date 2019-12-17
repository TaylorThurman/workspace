package com.workspace.workspace.codeSignalAlgos;

import java.util.HashMap;
import java.util.Map;

public class firstDuplicate {

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(a));
    }

    static int firstDuplicate(int[] a) {
        Map<Integer, Integer> dups = new HashMap();
        for (int i : a) {
            if (dups.containsKey(i)) {
                return i;
            } else {
                dups.put(i, 1);
            }
        }
        return -1;
    }

}
