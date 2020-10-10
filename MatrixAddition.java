package com.company;

// Написать метод, который принимает на вход две матрицы и возвращает их сумму.
public class MatrixAddition {

    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
	int[][] matrix1 = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {0, -1, -2, -3}};

	int [][] matrix2 = {{13, -2, -3, 10},
                        {-5, 8, 7, -8},
                        {-9, 4, 3, -12},
                      {14, 1, 2, 17}};
	int[][] additionMatrix = matrixAddition(matrix1,matrix2);

        for (int i = 0; i < additionMatrix.length; i++){
            for (int j = 0; j < additionMatrix[i].length;j++){
                System.out.printf("%3d",additionMatrix[i][j]);
            }
            System.out.println("");
        }
    }
}
