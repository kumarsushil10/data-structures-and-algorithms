package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MatrixProblems matrixProblems = new MatrixProblems();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Lower Triangle Matrix");
        matrixProblems.lowerTriangleMatrix(matrix);
        System.out.println("Upper Triangle Matrix");
        matrixProblems.upperTriangleMatrix(matrix);
    }
}