package com.astontech.menteeTrainingAlgos.codeSignal;

public class FindStrInStr {

    public static void main(String[] args) {
//        System.out.println(findStrInStr( "CodefightsIsAwesome", "IsA"));
//        System.out.println(findStrInStr( "a", "a"));
//        System.out.println(findStrInStr( "ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf", "cb"));
        System.out.println(findStrInStr( "aBcDefghaBcdEFgh", "ghb"));
    }

    public static int findStrInStr(String s, String x) {
        char[] sChars = s.toCharArray();
        char[] xChars = x.toCharArray();
        int startIndex = -1;
        int count = 0;

        outer:
        for (int i = 0; i < sChars.length; i++) {
            count = 0;
            for (int j = 0; j < xChars.length; j++) {
                if (sChars[i + j] == xChars[j] && (sChars[i + j] < sChars[sChars.length - 1])) {
                    count += 1;
                }
            }
        }
        System.out.println( count);

        return startIndex;
    }
}
