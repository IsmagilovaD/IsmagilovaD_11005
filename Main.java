package com.company;

//Проверить, есть ли в квадратной матрице n/2 чётных чисел, расположенных по диагонали, где n - размер матрицы.
public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4, 6},
                         {5, 9, 7, 10},
                         {9, 98 , 7, 9},
                         {1, 88, 33, 1}};
        int k = 0;
        int j = 0;
        for (int i = 0;i < matrix.length; i++){
            if (matrix[i][j]%2 == 0){
                k++;
            }
            j++;
        }
        int p = matrix.length - 1;
        int l = 0;
        for (int i = 0; i< matrix.length ; i++){
            if (matrix[i][p]%2 == 0){
                l++;
            }
            p--;
        }
        if ((k >= (matrix.length)/2) | (l >= (matrix.length)/2)){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
