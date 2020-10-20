package com.company;

// Рекурсивно посчитать произведение чисел от 1 до N.
public class MultiplyNumbers {
    public static int multiplyNumbers(int n){
        if (n < 1)
            return 1;
        return n * multiplyNumbers(n-1);
    }
    public static void main(String[] args) {
	int n = 6;
	System.out.print("Factorial: "+ multiplyNumbers(n));
    }
}

