package com.workspace.workspace.codeSignalAlgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByHeight {

    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160};
        System.out.println(sortByHeight(a));
    }

    static int[] sortByHeight(int[] a) {
        int[] newOrder = new int[a.length];
        List<Integer> people = new ArrayList();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                newOrder[i] = a[i];
            } else {
                people.add(a[i]);
            }
        }

        Collections.sort(people);
        int countPeople = 0;
        for (int i = 0; i < newOrder.length; i++) {
            if (newOrder[i] != -1) {
                newOrder[i] = people.get(countPeople);
                countPeople++;
            }
        }
        return newOrder;
    }

}
