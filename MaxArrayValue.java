package com.company;

// Написать метод, который находит максимальное значение массива.
public class MaxArrayValue {
    public static int maxArray(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i]> max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
	int[] arr = {-1, -5, 6, -3, -7};
        System.out.println(maxArray(arr));
    }
}
