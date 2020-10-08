package com.company;

import java.util.Scanner;

//Бинарный поиск
public class BinarySearch {

    public static void binarySearch(int[] x, int isk, int left, int right) {
        int index = -1;
        while (left <= right) {
            int center = (left + right) / 2;
            if (x[center] < isk) {
                left = center + 1;
            }
            else if (x[center] > isk) {
                right = center - 1;
            }
            else if (x[center] == isk) {
                index = center;
                break;
            }
        }
        System.out.print(index);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] x = {-2, 1, 2, 3, 4, 4, 5, 7, 8, 9};
    int left = 0;
    int right = x.length -1;

        int isk = in.nextInt();
        binarySearch(x,isk,left,right );

    }
}
