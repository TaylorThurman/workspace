package com.astontech.menteeTrainingAlgos.codeSignal;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Minesweeper {

//    https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM

    public static void main(String[] args) {
        boolean[][] matrix =
                new boolean[][]{{true, false, false},
                                {false, true, false},
                                {false, false, false}};
        System.out.println(Arrays.deepToString(minesweeper(matrix)));
    }

    public static int[][] minesweeper(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {

                if (matrix[y][x]) {
                    // up
                    if (y != 0) {
                        result[y-1][x] += 1;
                        if (x!=0) {
                            //up left
                            result[y-1][x-1] +=1;
                        }
                        if (x != matrix[y].length-1) {
                            // up right
                            result[y-1][x+1] += 1;
                        }
                    }
                    if (y != matrix.length-1) {
                        //down
                        result[y+1][x] +=1;
                        if (x!=0) {
                            //up left
                            result[y+1][x-1] +=1;
                        }
                        if (x != matrix[y].length-1) {
                            // up right
                            result[y+1][x+1] += 1;
                        }
                    }
                    if (x != 0) {
                        // left
                        result[y][x-1] += 1;
                    }
                    if (x != matrix[y].length -1) {
                        // right
                        result[y][x+1] += 1;
                    }
                }
            }
        }

        return result;
    }
}
