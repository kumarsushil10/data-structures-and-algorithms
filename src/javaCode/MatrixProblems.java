package javaCode;

public class MatrixProblems {
    public void addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void subtractTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void multiplyTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public boolean isBothMatrixSame(int[][] matrix1, int[][] matrix2) {
        for (int k = 0; k < matrix1.length || k < matrix2.length; k++) {
            if (matrix1.length != matrix2.length || matrix1[k].length != matrix2[k].length) {
                return false;
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void lowerTriangleMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void upperTriangleMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void totalOddEvenInMatrix(int[][] matrix) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][j] & 1) == 1) {
                    countOdd++;
                } else {
                    countEven++;
                }
            }
        }
        System.out.println("Total Even Number is : " + countEven);
        System.out.println("Total Odd Number is : " + countOdd);
    }

    public void sumOfRowAndColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }
            System.out.println("sum of Row " + i + " is " + rowSum);
            System.out.println("sum of Column " + i + " is " + columnSum);
        }
    }

    public void transpose(int[][] matrix) {
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("--- Transpose ---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
