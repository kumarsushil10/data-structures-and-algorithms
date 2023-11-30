package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MatrixProblems matrixProblems = new MatrixProblems();
        int[][] matrix1 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        System.out.println(matrixProblems.isBothMatrixSame(matrix1, matrix2));
    }
}