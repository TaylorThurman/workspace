package com.workspace.workspace.codeSignalAlgos;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(commonCharacterCount(s1, s2));
    }

    static int commonCharacterCount(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            if (s1Map.containsKey(c)) {
                s1Map.put(c, s1Map.get(c) + 1);
            } else {
                s1Map.put(c, 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if (s2Map.containsKey(c)) {
                s2Map.put(c, s2Map.get(c) + 1);
            } else {
                s2Map.put(c, 1);
            }
        }
        int commonLetterCount = 0;
        for (Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
            if (s2Map.get(entry.getKey()) != null) {
                if (s2Map.get(entry.getKey()) > entry.getValue()) {
                    commonLetterCount += entry.getValue();
                } else {
                    commonLetterCount += s2Map.get(entry.getKey());
                }
            }
        }

        return commonLetterCount;
    }
}
