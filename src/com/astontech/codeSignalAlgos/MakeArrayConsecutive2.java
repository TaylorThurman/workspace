package com.workspace.workspace.codeSignalAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {

    public static void main(String[] args) {
        int[] stats = {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2(stats));
    }

    static int makeArrayConsecutive2(int[] statues) {
        List<Integer> statueList = new ArrayList<>();
        for (int i : statues) {
            statueList.add(i);
        }
        Collections.sort(statueList);
        int statuesNeeded = 0;
        for (int i = 0; i < statueList.size() - 1; i++) {
            int heightDifference = (statueList.get(i + 1) - statueList.get(i));
            if (heightDifference > 1) {
                statuesNeeded += heightDifference -1;
            }
        }
        return statuesNeeded;

    }
}
