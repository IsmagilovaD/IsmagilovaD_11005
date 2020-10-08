package com.company;

//Быстрая сортировка
public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {

        int center = left + (right - left) / 2;

        int i = left, j = right;

        while (array[i] < array[center]) {
            i++;
        }
        while (array[j] > array[center]) {
            j--;
        }

        if (i <= j){
            if (i < j) {
                int hlp = array[i];
                array[i] = array[j];
                array[j] = hlp;
            }
        i++;
        j--;
    }
            if (left < j) {
                quickSort(array, left, j);
            }
            if (right > i) {
                quickSort(array, i, right);
            }

    }

    public static void main(String[] args) {
        int[] x = { 8, 0, 1, 2, 4, 3, 5, 9, 6, 7 };

        int left = 0;
        int right = x.length - 1;

        quickSort(x, left, right);
        for (int i = 0; i < x.length ; i++ ) {
            System.out.printf(" %d", x[i]);
        }


    }
}
