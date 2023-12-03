package javaCode;

public class Main {
    public static void main(String[] args) {
        MatrixProblems matrixProblems = new MatrixProblems();
        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(matrixProblems.isIdenticalMatrix(matrix1));
        System.out.println(matrixProblems.isIdenticalMatrix(matrix2));

    }
}