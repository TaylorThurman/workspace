package com.workspace.workspace.codeSignalAlgos;

public class AddBorder {

    public static void main(String[] args) {
        String[] picture = {"abc",
                            "ded"};
        System.out.println(addBorder(picture));
    }

    static String[] addBorder(String[] picture) {
        String[] borderedPic = new String[picture.length + 2];
        StringBuilder stars = new StringBuilder("*");

        for (int i = 0; i <= picture[0].toCharArray().length; i++) {
            stars.append("*");
        }

        borderedPic[0] = stars.toString();
        borderedPic[borderedPic.length-1] = stars.toString();

        for (int i = 1; i < borderedPic.length-1; i++) {
            borderedPic[i] = "*" + picture[i - 1] + "*";
        }

        return borderedPic;
    }

}
