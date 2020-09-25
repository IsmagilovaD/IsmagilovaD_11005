package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{5, 3, 4, 1},
                          {4, 7, 6, 5},
                          {7, 9, 10, 8}};
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (m - i -1); j++) {
                if (matrix[0][j] > matrix[0][j + 1]) {
                    for (int k = 0; k < n; k++) {
                        int c = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = c;
                    }
                }
            }
        }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.format("%d ", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
