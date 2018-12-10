package com.workspace.workspace.codeSignalAlgos;

public class MatrixElementSum {

    public static void main(String[] args) {
    int[][] matrix = {{1, 1, 1, 0},
                      {0, 5, 0, 1},
                      {2, 1, 3, 10}};
        System.out.println(matrixElementsSum(matrix));
    }

    static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int current = matrix[i][j];
                if (i == 0){
                    sum += current;
                } else {
                    if (matrix[i -1][j] != 0) {
                        sum += current;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }

        }

        return sum;
    }
}
