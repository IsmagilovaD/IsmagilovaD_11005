package com.company;
import java.util.Scanner;

// Написать метод, который выводит строку в обратном порядке.
public class ReverseString {
    public static void reverseSting(String str){
        char[] chaarray = str.toCharArray();
        for (int i = chaarray.length-1; i >= 0; i-- ){
            System.out.print(chaarray[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	reverseSting(str);
    }
}
