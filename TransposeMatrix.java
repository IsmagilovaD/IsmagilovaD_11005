package com.company;

// Написать метод, который принимает на вход матрицу и транспонирует её.
public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] resMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < resMatrix[0].length; j++) {
                resMatrix[i][j] = matrix[j][i];
            }
        }
        return resMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] transposedMatrix = transposeMatrix(matrix);

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.printf("%3d", transposedMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}
