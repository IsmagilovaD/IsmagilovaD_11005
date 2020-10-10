package com.company;

import java.util.Arrays;

// Сортировка строки
// Сложность алгоритма О(n logn)
public class StringSort2 {

    public static void main(String[] args) {
        String str = "abc bac bbc cab cba";
        String[] words = str.split(" ");
        int left = 0;
        int right = words.length - 1;
        quickSort(words, left, right);
        System.out.println(Arrays.toString(words));

    }
        public static void quickSort(String[] array, int left, int right) {

            int center = left + (right - left) / 2;
            int i = left, j = right;

            while (array[i].compareTo(array[center])<0) {
                i++;
            }
            while (array[j].compareTo(array[center])>0) {
                j--;
            }

            if (i <= j){
                if (i < j) {
                    String hlp = array[i];
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
    }
