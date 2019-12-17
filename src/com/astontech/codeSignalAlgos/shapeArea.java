package com.workspace.workspace.codeSignalAlgos;

public class shapeArea {

    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }

    static int shapeArea(int n) {
        int area = 0;
        for (int i=1; i <= n; i++) {
            if (i == 1) {
                area += 1;
            } else {
                int blocksToAdd = (i-1) * 4;
                area += blocksToAdd;
            }
        }

        return area;
    }

}
