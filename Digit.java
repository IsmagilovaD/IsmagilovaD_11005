package com.company;
import java.util.Scanner;

// Написать метод, который считает количество разрядов числа.
public class Digit {
    public static void digit(int x){
        int k = 0;
        while (x > 0){
            x = x/10;
            k++;
        }
        System.out.print(k);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	digit(x);
    }
}
