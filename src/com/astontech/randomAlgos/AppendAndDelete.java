package main.java.com.workspace.workspace.randomAlgos;

public class AppendAndDelete {

    // still yet to find a solution
//    https://www.hackerrank.com/domains/java?filters%5Bstatus%5D%5B%5D=unsolved&filters%5Bdifficulty%5D%5B%5D=easy&filters%5Bsubdomains%5D%5B%5D=java-strings&badge_type=java

    public static void main(String[] args) {
//        returnString("aba", "aba", 7);
//        System.out.println(returnString("aba", "aba", 7));
//        System.out.println(returnString("ashley", "ash", 2));
        System.out.println(returnString("y", "yu", 2));
//        System.out.println(returnString("hackerhappy", "hackerrank", 9));
//        System.out.println(returnString("aaaaaaaaaa", "aaaaa", 7));
    }

    private static String returnString(String s, String t, int k) {
        int changes = 0;

        if (s.contains(t) || t.contains(s)) {
            while (s.length() != 0 && changes != k) {
                s = s.substring(0, s.length() - 1);
                changes++;
            }

            int tIndex = 0;
            if (s.length() != 0) {
                tIndex = s.length();
            }
            while (s.length() != t.length() && changes != k) {
                if (s.length() == 0) changes++;
                s = s + t.charAt(tIndex);
                tIndex++;
                changes++;
            }
        } else {
            while (s.length() != 0 && changes != k) {
                s = s.substring(0, s.length() - 1);
                changes++;
                if (t.contains(s)) break;
            }

            int tIndex = 0;
            if (s.length() != 0) {
                tIndex = s.length();
            }
            while (s.length() != t.length() && changes != k) {
                if (s.length() == 0) changes++;
                s = s + t.charAt(tIndex);
                tIndex++;
                changes++;
            }
        }

        System.out.println(changes);
        System.out.println(s);

        if (changes == k && s.length() == t.length()) {
            return "Yes";
        }
        return "No";
    }
}
