package javaCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MatrixProblems matrixProblems = new MatrixProblems();
        int[][] matrix1 = new int[][]{{9, 2, 31}, {8, 32, 32}, {1, 28, 3}};
        int[][] matrix2 = new int[][]{{1, 22, 3}, {1, 82, 3}, {13, 2, 93}};
        System.out.println("Addition of two matrix : ");
        matrixProblems.addTwoMatrix(matrix1, matrix2);
        System.out.println("Subtraction of two matrix : ");
        matrixProblems.subtractTwoMatrix(matrix1, matrix2);
        System.out.println("Multiplication of two matrix : ");
        matrixProblems.multiplyTwoMatrix(matrix1, matrix2);


    }
}