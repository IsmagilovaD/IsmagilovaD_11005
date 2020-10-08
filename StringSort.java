package com.company;
import java.util.Arrays;

//сортирова строки
//сложность алгоритма О(n logn)
public class StringSort {

    public static void main(String[] args) {
	String[] s = {"bca", "cba", "abc", "cca"};
	Arrays.sort(s);
		System.out.println(Arrays.toString(s));
    }
}
